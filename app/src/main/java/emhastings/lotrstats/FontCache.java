package emhastings.lotrstats;

import android.content.Context;
import android.graphics.Typeface;

import java.util.Hashtable;

/**
 * Created by ehast on 1/1/2018.
 *
 * By Cabezas on StackOverflow.  https://stackoverflow.com/questions/6372458/setting-button-text-font-in-android
 */

public class FontCache {

    private static Hashtable<String, Typeface> fontCache = new Hashtable<>();

    public static Typeface getTypeface(String name, Context context) {
        Typeface tf = fontCache.get(name);
        if(tf == null) {
            try {
                tf = Typeface.createFromAsset(context.getAssets(), name);
            }
            catch (Exception e) {
                return null;
            }
            fontCache.put(name, tf);
        }
        return tf;
    }
}
