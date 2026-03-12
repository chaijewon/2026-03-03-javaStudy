/*
 *   new => 저장 갯수 확인 
 *    | => 파일 => 초기화 
 *    | => 검색 
 */
public class 배열_4 {

	public static void main(String[] args) {
		// 기능별로 
		// TODO Auto-generated method stub
        String[] names={"홍길동","이순신","강감찬",
        		   "박문수","김두한"};
        String[] address={"서울","경기","강원","제주","부산"};
        
        // 홍길동(서울)
        for(int i=0;i<names.length;i++)
        {
        	System.out.println(names[i]+"("+address[i]+")");
        }
	}

}
