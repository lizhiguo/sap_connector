package com.majul.sap;

import java.util.concurrent.atomic.AtomicReference;

import org.hibersap.configuration.AnnotationConfiguration;
import org.hibersap.configuration.xml.SessionManagerConfig;
import org.hibersap.configuration.xml.ValidationMode;
import org.hibersap.session.Session;
import org.hibersap.session.SessionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.majul.bapi.AGS_API_CHANGE_PROJECT_CONTENT.AgsApiChangeProjectContent;
import com.majul.bapi.AGS_API_CHANGE_PROJECT_STRUCT.AgsApiChangeProjectStruct;
import com.majul.bapi.AGS_API_READ_PROJECTSTRUCTURE.AgsApiReadProjectstructure;
import com.majul.bapi.AGS_API_READ_PROJ_CONTENT_OBJ.AgsApiReadProjContentObj;
import com.majul.bapi.AGS_API_READ_PROJ_CONTENT_TYPE.AgsApiReadProjContentType;
import com.majul.bapi.AGS_API_READ_PROJ_CONT_OBJ_TYP.AgsApiReadProjContObjTyp;

@Service
public class SapSessionManager {

	private static AtomicReference<Session> SESSION = new AtomicReference<Session>();
	private static AtomicReference<SessionManager> SESSION_MANAGER = new AtomicReference<SessionManager>();

	@Autowired
	public SapSessionManager(
			final SapConfiguration sapConfiguration) {

		if (SESSION_MANAGER.get() == null) {

			final SessionManagerConfig sessionConf = new SessionManagerConfig("majul");

			sessionConf.setValidationMode(ValidationMode.AUTO);

			sessionConf.setProperty("jco.client.lang", sapConfiguration.getLang());
			sessionConf.setProperty("jco.client.user", sapConfiguration.getUser());
			sessionConf.setProperty("jco.client.sysnr", sapConfiguration.getSysnr());
			sessionConf.setProperty("jco.client.passwd", sapConfiguration.getPasswd());
			sessionConf.setProperty("jco.client.client", sapConfiguration.getClient());
			sessionConf.setProperty("jco.client.ashost", sapConfiguration.getAshost());
			sessionConf.setProperty("jco.destination.peak_limit", sapConfiguration.getPeakLimit());
			sessionConf.setProperty("jco.destination.pool_capacity", sapConfiguration.getPoolCapacity());

			final AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration(sessionConf);

			annotationConfiguration.addBapiClasses(AgsApiChangeProjectContent.class);
			annotationConfiguration.addBapiClasses(AgsApiChangeProjectStruct.class);
			annotationConfiguration.addBapiClasses(AgsApiReadProjContObjTyp.class);
			annotationConfiguration.addBapiClasses(AgsApiReadProjContentObj.class);
			annotationConfiguration.addBapiClasses(AgsApiReadProjContentType.class);
			annotationConfiguration.addBapiClasses(AgsApiReadProjectstructure.class);

			SESSION_MANAGER.set(annotationConfiguration.buildSessionManager());

		}

	}

	public SessionManager getInstance() {

		return SESSION_MANAGER.get();
	}

	public Session getSession() {

		if (SESSION.get() == null) {
			SESSION.set(SESSION_MANAGER.get().openSession());
		}

		return SESSION.get();
	}

}
