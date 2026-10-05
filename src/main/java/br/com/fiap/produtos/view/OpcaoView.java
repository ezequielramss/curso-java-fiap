package br.com.fiap.produtos.view;

import javax.swing.*;
import java.awt.*;

public class OpcaoView {

    public static Opcao select(){
        Opcao ret = (Opcao) JOptionPane.showInputDialog(
                null,
                "Selecione uma opção ",
                "MenuT",
                JOptionPane.QUESTION_MESSAGE,
                null,
                Opcao.values(),
                Opcao.CADASTRAR_PRODUTO);

                return ret!= null ? ret : Opcao.ENCERRAR_SISTEMA;
    }
}
