package sticker;


public class Spielwiese {
    
    public static void main(String[] args) {
        StickerAlbum album = new StickerAlbum(168);
        album.stickerKaufen(20);
        album.berechneFüllstand();
        album.druckeAlbum();
    }
}
