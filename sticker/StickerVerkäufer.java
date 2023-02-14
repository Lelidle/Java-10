package sticker;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class StickerVerkäufer {
    
    private HashMap<Integer,String[]> daten;

    public StickerVerkäufer() {
        try {
            daten = ladeDaten();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void schreibeDaten() {
        for(Map.Entry<Integer, String[]> set : daten.entrySet()) {
            System.out.print(set.getKey() + " ");
            for(String l : set.getValue()) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
    
    public Sticker[] packungKaufen(){
        Sticker[] gekaufteSticker = new Sticker[5];
        for(int i = 0; i < 5; i++) {
            if(Math.random()>0.95){
                int stickerNummer = (int) Math.floor((Math.random()*18+150));
                gekaufteSticker[i] = new Sticker(stickerNummer, daten.get(stickerNummer)[0], "gold");
            } else {
                int stickerNummer = (int) Math.floor((Math.random()*149 + 1));
                gekaufteSticker[i] = new Sticker(stickerNummer, daten.get(stickerNummer)[0]);
            }
        }
        return gekaufteSticker;
    }

    private HashMap<Integer,String[]> ladeDaten() throws IOException {
        HashMap<Integer,String[]> daten = new HashMap<Integer,String[]>();
        InputStream input = StickerVerkäufer.class.getResourceAsStream("pokemon.csv");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
            while (reader.ready()) {
                String[] line = reader.readLine().split(",");
                daten.put(Integer.parseInt(line[0]), new String[]{line[1], line[2]});
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return daten;
    }

}
