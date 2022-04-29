package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Long, String> usuarios = new HashMap<>();

        usuarios.put(1L, "Fran");
        usuarios.put(1L, "Ricardo");
        usuarios.put(2L, "Rafaela");
        usuarios.put(3L, "Francielli");
        usuarios.put(10L, "Renan");
        usuarios.put(7L, "Valdei");

        System.out.println(usuarios.size());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Renan"));

        for(Long chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        for(String valor: usuarios.values()) {
            System.out.println(valor);
        }

        for(Map.Entry<Long, String> registro: usuarios.entrySet()) {
            System.out.println(registro);
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }
    }
}
