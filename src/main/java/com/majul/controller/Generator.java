package com.majul.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.hibersap.HibersapException;
import org.hibersap.generation.bapi.BapiClassFormatter;
import org.hibersap.generation.bapi.ReverseBapiMapper;
import org.hibersap.mapping.model.BapiMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.majul.sap.SapSessionManager;

@RestController
public class Generator {

	@RequestMapping(value = "/generate", method = RequestMethod.GET)
	public void generate(
			@RequestParam final String bapiName) {

		final String dir = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
				+ File.separator + "java" + File.separator + "com" + File.separator + "majul" + File.separator + "bapi"
				+ File.separator + bapiName;

		final File outputDirFile = new File(dir);
		outputDirFile.mkdirs();

		final BapiMapping bapiMapping = new ReverseBapiMapper().map(bapiName, SapSessionManager.getInstance());
		final Map<String, String> classForName = new BapiClassFormatter()
				.createClasses(bapiMapping, "com.majul.bapi." + bapiName);

		for (final String className : classForName.keySet()) {

			final String fileName = className + ".java";
			final String content = classForName.get(className);

			writeToDisk(outputDirFile, fileName, content);

		}

	}

	private void writeToDisk(
			final File outputDir,
			final String fileName,
			final String content) {

		try {

			final File file = new File(outputDir, fileName);

			final FileWriter writer = new FileWriter(file);
			writer.append(content);
			writer.close();

		} catch (IOException e) {
			throw new HibersapException("File " + fileName + " could not be written to file system.", e);
		}

	}

}
