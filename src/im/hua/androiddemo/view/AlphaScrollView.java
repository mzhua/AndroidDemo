package im.hua.androiddemo.view;

import android.content.Context;
import android.graphics.*;
import android.util.AttributeSet;
import android.widget.ScrollView;
import im.hua.androiddemo.R;

/**
 * Created by Hua on 2015/4/15.
 */
public class AlphaScrollView extends ScrollView {
    private Bitmap bgBitmap;

    public AlphaScrollView(Context context) {
        this(context, null);
    }

    public AlphaScrollView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AlphaScrollView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        bgBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.welcome_bg);
        setBackgroundColor(Color.WHITE);

    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        Paint paint = new Paint();
        paint.setAlpha(105);
        canvas.drawBitmap(bgBitmap, new Rect(0, 0, bgBitmap.getWidth(), bgBitmap
                .getHeight()), new Rect(0, 0, bgBitmap.getWidth(), bgBitmap
                .getHeight()), paint);

    }
}
