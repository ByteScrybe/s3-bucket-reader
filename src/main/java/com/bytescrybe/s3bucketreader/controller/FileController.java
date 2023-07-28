package com.bytescrybe.s3bucketreader.controller;

import com.bytescrybe.s3bucketreader.service.S3Service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/file")
public class FileController {
    private final S3Service s3Service;

    public FileController(S3Service s3Service) {
        this.s3Service = s3Service;
    }

    @GetMapping("/download")
    public void downloadFile() {
        this.s3Service.downloadObject("finer-buffalo-bucket", "document.txt");
        log.info("File downloaded");
    }

}
