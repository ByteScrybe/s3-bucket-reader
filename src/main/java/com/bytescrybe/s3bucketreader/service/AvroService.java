package com.bytescrybe.s3bucketreader.service;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileStream;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AvroService {
    public void readAvroFile(File file) {
        log.info("Reading Avro file");
        DatumReader<GenericRecord> datumReader = new GenericDatumReader<>();
        try (DataFileReader<GenericRecord> dataFileReader = new DataFileReader<>(file, datumReader)) {
            GenericRecord avroRecord = null;
            while (dataFileReader.hasNext()) {
                avroRecord = dataFileReader.next(avroRecord);
                log.info("Record: {}", avroRecord);
            }
        } catch (Exception e) {
            log.error("Error reading Avro file", e);
        }
    }

    public void parseAvroFile(InputStream inputStream) {
        DatumReader<GenericRecord> datumReader = new GenericDatumReader<>();
        try (DataFileStream<GenericRecord> dataFileReader = new DataFileStream<>(inputStream, datumReader)) {
            GenericRecord avroRecord = null;
            while (dataFileReader.hasNext()) {
                avroRecord = dataFileReader.next(avroRecord);
                log.info("Avro record: {}", avroRecord);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
