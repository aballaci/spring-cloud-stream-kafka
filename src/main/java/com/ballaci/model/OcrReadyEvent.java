package com.ballaci.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OcrReadyEvent {

    @JsonProperty
    private String fileRef;

    @JsonProperty
    private boolean status;

    @JsonProperty
    private int part;

    @JsonProperty
    private int total;

    public OcrReadyEvent() {
    }

    public OcrReadyEvent(String fileRef, boolean status) {
        this.fileRef = fileRef;
        this.status = status;
    }

    public OcrReadyEvent(String fileRef, boolean status, int part) {
        this.fileRef = fileRef;
        this.status = status;
        this.part = part;
    }

    public OcrReadyEvent(String fileRef, boolean status, int part, int total) {
        this.fileRef = fileRef;
        this.status = status;
        this.part = part;
        this.total = total;
    }

    public int getPart() {
        return part;
    }

    public void setPart(int part) {
        this.part = part;
    }

    public String getFileRef() {
        return fileRef;
    }

    public void setFileRef(String fileRef) {
        this.fileRef = fileRef;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "OcrReadyEvent{" +
                "fileRef='" + fileRef + '\'' +
                ", status=" + status +
                ", parts=" + part +
                ", total=" + total +
                '}';
    }
}
