package com.test.file.upload;

import com.vu.au.aspera.soap.client.AsperaSOAPClient;
import com.vu.au.aspera.soap.client.model.job.JobResultType;

public class FileUploadUtil {
	public static final String keypath="/home/aspera/.ssh/id_rsa-cntrylnk0001";
	public static final String egressFolderPath = "/snfs1/VOD/Processing/PROD/AVC/EgressToAspera/";
	public static final String aKamaiPath = "/hls/vu/";
	public static final String ASPERA_CONNECT_URL = "http://burb-aspc-d001.dev.vubiquity.com:40001";
	public static final String ASPERA_USER_NAME = "aspera";
	public static final String ASPERA_PWD = "aspera";
	public static final String REMOTE_AKAMAI_HOST = "jb001.aspera.upload.akamai.com";

	public static void main(String[] args) {
		System.out.println("test method");
	}
    
	
	public void processFileUploadF(FileUploadInput input){
		String xml = populateSOAPXML(input);
	}
    
    private  String  populateSOAPXML(FileUploadInput input){
    	String soapXML = "<Order><Version>2</Version><Agent>Aspera.AsperaConnect</Agent> "+
							"<ApplicationData><Cookie>ffae0952-7736-4e68-9993-412f651d4a7d</Cookie>"+
							"</ApplicationData><Operation>Push</Operation><RemoteLocation><System>"+
							"<Address>"+REMOTE_AKAMAI_HOST+"/Address><Port>22</Port>"+
							"<UserName>sshacs</UserName></System><Authentication><Methods><Method>Public Key</Method></Methods>"+
							"<KeyPath>"+input.getKeyPath()+"</KeyPath></Authentication><Files><Path>/"+input.getCpCode()+input.getAkamaiFilePathToAppend()+"</Path></Files>"+
							"</RemoteLocation><LocalLocation><System><UserName>"+ASPERA_USER_NAME+"</UserName><Password>"+ASPERA_PWD+"</Password>"+
							"</System><Files><Path>"+input.geteGressFilePath()+"/"+input.getCpCode()+"</Path></Files></LocalLocation>"+
							"<FileParameters><CreatePath>Yes</CreatePath><Overwrite>Always</Overwrite><RemoveAfterTransfer>Yes</RemoveAfterTransfer>"+
							"<RemoveEmptyDirectories>Yes</RemoveEmptyDirectories></FileParameters></Order>";
     
    return soapXML;
    
	}
    

    
    private AsperaSOAPClient getAsperaSoapClient(String url,String jobXML){
    AsperaSOAPClient client = new AsperaSOAPClient();
    	
    try{
    	JobResultType jobResultType = client.getsoapClientUtilSubmit(url, jobXML);
    }catch(Exception e){
    	e.printStackTrace();
    }
	return client;
    }
    
    
}


