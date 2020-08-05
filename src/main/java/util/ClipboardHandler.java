package main.java.util;
// done revisioning
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClipboardHandler {

    private final static Clipboard CLIPBOARD = Toolkit.getDefaultToolkit().getSystemClipboard();

    private ClipboardHandler() {

    }

    public static String getClipboardContents() {
        try {
            return (String) CLIPBOARD.getData(DataFlavor.stringFlavor);
        } catch (UnsupportedFlavorException | IOException ex) {
            Logger.getLogger(ClipboardHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void setClipboardContents(String str) {
        CLIPBOARD.setContents(new StringSelection(str), null);
    }

}
