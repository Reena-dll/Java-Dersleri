public class main {
    public static void main(String[] args) {
        // 1 ve 100 arasında ki asal sayıları bulan program

        int kontrol;

        for (int i = 2; i <= 100; i++)
        {
            kontrol = 0;

            for (int j = 2; j <= i/2; j++)
            {
                if(i%j==0)
                {
                    kontrol++;
                    break;
                }
            }
            if (kontrol == 0)
            {

                System.out.print(i+" ");
            }
        }
    }
}

