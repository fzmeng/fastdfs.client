package com.m.fastdfs;

import java.io.File;
import java.io.FileInputStream;

import com.m.fastdfs.sources.FileInfo;
import com.m.fastdfs.sources.ServerInfo;
import com.m.fastdfs.sources.StorageServer;

public class FileTest {

	 public static void main(String[] args) throws Exception{
		 new FileTest().upload();
	       /* for(int i=0;i<1;i++){
	            new FileTest().upload();
	        }*/
	       // new FileTest().getFile();
	    }
	    
	    public void upload() throws Exception {
	        File content = new File("/Users/mfz/Desktop/logo.png");
	        
	        FileInputStream fis = new FileInputStream(content);
	        byte[] file_buff = null;
	        if (fis != null) {
	            int len = fis.available();
	            file_buff = new byte[len];
	            fis.read(file_buff);
	        }
	        
	        FastDFSFile file = new FastDFSFile("520", file_buff, "png");
	        
	        String fileAbsolutePath = FileManager.upload(file);
	        System.out.println(fileAbsolutePath);
	        fis.close();
	    }
	    
	    
	    public void getFile() throws Exception {
	        FileInfo file = FileManager.getFile("M00/00/00/CmSLeFjfYPOAJT7XAAG5TGPteQk172.png");
	        
	        String sourceIpAddr = file.getSourceIpAddr();
	        long size = file.getFileSize();
	        System.out.println("ip:" + sourceIpAddr + ",size:" + size);
	    }
	    
	    
	    public void getStorageServer() throws Exception {
	        StorageServer[] ss = FileManager.getStoreStorages("group1");
	       
	        
	        for (int k = 0; k < ss.length; k++){
	            System.err.println(k + 1 + ". " + ss[k].getInetSocketAddress().getAddress().getHostAddress() + ":" + ss[k].getInetSocketAddress().getPort());
	        }
	    }
	    
	    
	    public void getFetchStorages() throws Exception {
	        ServerInfo[] servers = FileManager.getFetchStorages("group1", "M00/00/00/wKgBm1N1-CiANRLmAABygPyzdlw073.jpg");
	       
	        
	        for (int k = 0; k < servers.length; k++) {
	            System.err.println(k + 1 + ". " + servers[k].getIpAddr() + ":" + servers[k].getPort());
	        }
	    } 
}
