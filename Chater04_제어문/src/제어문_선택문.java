/*
 *    형식) 
 *                (no)  no=1
 *         switch(정수/문자/문자열)  => 게임 / 메뉴 처리 
 *         {
 *           case 1:  => if(no==1)
 *              처리문장 
 *              break;
 *           case 2:  => if(no==2)
 *              처리문장
 *              break;
 *           case 3:  => if(no==3)
 *              처리문장
 *              break; 
 *           default:
 *              처리문장 
 *         }
 */
public class 제어문_선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int no=89;
        char op='A';
        switch(no/10)
        {
        case 10:
        case 9:
        	op='A';
        	break;
        case 8:
        	op='B';
        	break;
        case 7:
        	op='C';
        	break;
        case 6:
        	op='D';
        	break;
        default:
        	op='F';
        }
        System.out.println(op);
	}

}
