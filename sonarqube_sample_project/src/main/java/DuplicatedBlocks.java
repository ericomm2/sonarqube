public class DuplicatedBlocks {

    private int tmp;

    public int firstBlock(int i){
        if(i>10) {
            tmp += 10;
            tmp = tmp*tmp*tmp;
            tmp += 10;
            tmp += 10;
            tmp += 10;
            tmp += 10;
            tmp += 10;
            tmp += 10;
            tmp += 10;
            tmp += 10;
            if (tmp > 50000) {
                return 15;
            } else {
                return 12;
            }
        }else{
            return 10;
        }
    }

    public int secondBlock(int i){
        if(i>10) {
            tmp += 10;
            tmp = tmp*tmp*tmp;
            tmp += 10;
            tmp += 10;
            tmp += 10;
            tmp += 10;
            tmp += 10;
            tmp += 10;
            tmp += 10;
            tmp += 10;
            if (tmp > 50000) {
                return 15;
            } else {
                return 12;
            }
        }else{
            return 10;
        }
    }

}
