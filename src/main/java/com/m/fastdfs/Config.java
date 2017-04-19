package com.m.fastdfs;

/** 
* @ClassName: Config 
* @Description: dfs服务器配置
* @author mengfanzhu
* @date 2017年4月1日 下午3:40:19 
*/
public interface Config {
	public static final String FILE_DEFAULT_WIDTH = "120";
	public static final String FILE_DEFAULT_HEIGHT = "120";
	public static final String FILE_DEFAULT_AUTHOR = "system";
	public static final String PROTOCOL = "http://";
	public static final String SEPARATOR = "/";
	public static final String TRACKER_NGNIX_PORT = "8888";//return ip:[port]
	public static final String CLIENT_CONFIG_FILE = "fastdfs_client.conf";
}
