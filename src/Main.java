import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<int[]>
                Stopgo = new ArrayList<int[]>();
        Stopgo.add(new int[]{10, 0});
        Stopgo.add(new int[]{3, 5});
        Stopgo.add(new int[]{2, 5});
        System.out.println(Stopgo);
    }

    public static int GetPassenger(ArrayList<int[]> biskota) {
        int result = 0;
        for (int n = 0; n < biskota.size(); n++) {
            for (int i = 0; i < biskota.get(n).length; i++) {
                if (biskota.get(n)[i] == biskota.get(n)[0]) {
                    result += biskota.get(n)[i];
                } else {

                    result -= biskota.get(n)[i];
                }
            }
        }

        return
                result = 0;
    }
}
//maaf pak saya sudah mentok hasilnya gak muncul :(