package emhastings.lotrstats;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/**
 * Created by ehast on 1/1/2018.
 *
 * By Cabezas on StackOverflow.  https://stackoverflow.com/questions/6372458/setting-button-text-font-in-android
 *
 * Colors from the Fellowship game box: https://www.funagain.com/faimages/catalog/product/large/2/013917_21467.jpeg
 */

public class FormattedButton extends android.support.v7.widget.AppCompatButton {

    public FormattedButton(Context context) {
        super(context);
        formatButton(context);
    }

    public FormattedButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        formatButton(context);
    }

    public FormattedButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        formatButton(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface("hobbitonbrushhand.ttf", context);
        setTypeface(customFont, Typeface.BOLD);
    }

    private void formatButton (Context context)  {
        //font
        applyCustomFont(context);
        setTextColor(Color.rgb(217, 140, 29));
        //setTextColor(Color.parseColor("#3A2A2E"));
        setTextSize(TypedValue.COMPLEX_UNIT_DIP, 18);

        //from https://stackoverflow.com/questions/18391830/how-to-programmatically-round-corners-and-set-random-background-colors
        GradientDrawable shape =  new GradientDrawable();
        shape.setCornerRadius( 8 );
        //shape.setColor(Color.rgb(112, 83, 43));
        shape.setColor(Color.parseColor("#3A2A2E"));
        setBackground(shape);


    }
}
