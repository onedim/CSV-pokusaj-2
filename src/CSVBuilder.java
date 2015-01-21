import java.io.*;



public class CSVBuilder {
	public static InputStream is;
	public static OutputStream os;
	public static FileOutputStream fos;
	public static FileInputStream fis;
	private static String basePath="."+File.separator+"Base"+File.separator;
	private static String curentOpen=null;
	
	public static <T extends CSVInterface> void saveObjects (String fileName,T objectToSave) throws IOException{
		if(fileName.equals(curentOpen)){
			os.write(objectToSave.objectToCSV().getBytes());
			
			
		}else{
			
			fos=new FileOutputStream(basePath+fileName+".csv",true);
			os=new DataOutputStream(fos); 
			curentOpen=fileName;
			os.write(objectToSave.objectToCSV().getBytes());
		}
		System.out.println(basePath);
		os.flush();
		System.out.println(objectToSave.objectToCSV());
		
	}
	public static <T extends CSVInterface> T findObject(String[]str){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length;i++){
			sb.append(str[i]).append(", ");
		}
		sb.append(str[str.length-1]);
		
		
		
		return null;
		
	}
}
