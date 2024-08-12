public class ReproduzirMusica {
        public void SelecionarMusica(String musica){
            System.out.println("Musica "+musica+" foi selecionada!");
            tocar();
        }
        public void tocar(){
            System.out.println("Tocando música...");
        }
        public void pausar(){
            System.out.println("Música em pausa...");
        }
}
