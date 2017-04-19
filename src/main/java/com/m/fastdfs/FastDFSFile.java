package com.m.fastdfs;

public class FastDFSFile implements Config{

    private String fileName;
    
    private byte[] content;
    
    private String ext;
    
    private String height = FILE_DEFAULT_HEIGHT;
    
    private String width = FILE_DEFAULT_WIDTH;
    
    private String author = FILE_DEFAULT_AUTHOR;
    
    public FastDFSFile(String fileName, byte[] content, String ext, String height,String width, String author) {
        super();
        this.fileName = fileName;
        this.content = content;
        this.ext = ext;
        this.height = height;
        this.width = width;
        this.author = author;
    }
    
    public FastDFSFile(String filefileName, byte[] content, String ext) {
        super();
        this.fileName = filefileName;
        this.content = content;
        this.ext = ext;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

 
}
