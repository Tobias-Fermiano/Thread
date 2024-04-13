public class MyThread extends Thread {
    private String cliente;
    private int quantidade;
    private int adiquirido;
    private static int lote = 1150;

    public MyThread(String comp, int quant, int adq) {
        this.cliente = comp;
        this.quantidade = quant;
        this.adiquirido = adq;
    }

    public void run() {
        while (lote > 0) {
            synchronized (MyThread.class){
                if(lote <= 0) {
                    break;
                }
                if (quantidade > lote) {
                    quantidade = lote;
                }
                System.out.println(cliente + " sacou: " + quantidade);
                lote -= quantidade;
                adiquirido += quantidade;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Lotes zerados!\n " + cliente + " sacou: "+ adiquirido);

    }
}
