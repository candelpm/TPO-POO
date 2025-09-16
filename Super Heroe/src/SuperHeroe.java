class SuperHeroe implements Volador, Corredor {

    @Override
    public void volar() {
        System.out.println("El superhéroe es Megamente.");
    }

    @Override
    public void correr() {
        System.out.println("El superhéroe es Flash.");
    }
}