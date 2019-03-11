public class Max {
    //判断这个对象相对于对象o的顺序，当对象小于等于大于o时，分别返回负整数、0或正整数。
    public static Comparable max(Comparable o1,Comparable o2){
        if(o1.compareTo(o2)>0){
            return o1;
        }else{
            return o2;
        }
    }
}

