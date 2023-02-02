package sticker;


public class Spielwiese {
    
    public static void main(String[] args) {
        StickerAlbum album = new StickerAlbum(168);
        album.stickerKaufen(25);
        album.berechneFüllstand();
        System.out.println();
        album.stickerKaufen(25);
        album.berechneFüllstand();
        System.out.println();
        album.stickerKaufen(500);
        album.einzahlen(500);
        System.out.println();
        album.stickerKaufen(500);
        album.berechneFüllstand();
    }
}
