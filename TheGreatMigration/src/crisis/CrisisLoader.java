package crisis;

import java.io.*;

public class CrisisLoader {

	public static void loadCrisis() {
		// TODO �Զ����ɵķ������
		
//		To load the file to create crisis
		File file = new File("Crisis.txt");
		String encoding="GBK";
		try{
			if(file.isFile() && file.exists()){
			
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file),encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
			}
/*		����������α��д��
        ������һ�У��Ҵ��в�Ϊ��ʱ��
               ����һ�������ֶ����Ǻ���
                     �� ��ô��������¼�����ǰ��������ָ����option�������ģ�
              ��������option��identifier���ҵ����ʵ��Ǹ�option���Ҳ����ͱ���
              ��ô���ǽ�option��nextCrisis������ã�ԭ����ʼ��Ϊnull���赽�´������������
                    Ȼ���´���һ��crisis����
                    Ȼ���ȡ�ո��Ժ�����ݣ�|ǰ����Ϊcrisis�����kind����һ��|�����Ϊ��description
                    ������|�����Ϊoption��description,Ȼ���ٽ���֮��Ĵ��룬����һһ����
        ����
              �½�һ��crisis���󣬲���isAutomaticlyHappen��Ϊtrue����ʾ���crisis�����Է�����
		
	
*/
		}catch(Exception ex){ System.out.println("��ȡ�ļ����ݳ���");ex.printStackTrace();}
	}

}
