package im.hua.androiddemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import im.hua.androiddemo.view.tip.ShowTipsBuilder;
import im.hua.androiddemo.view.tip.ShowTipsView;
import im.hua.androiddemo.view.tip.ShowTipsViewInterface;

public class MyActivity extends Activity {
    private ImageView appointment;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        appointment = (ImageView) findViewById(R.id.appointment);

        ShowTipsBuilder tipsBuilder = new ShowTipsBuilder(this).setBackgroundColor(getResources().getColor(android.R.color.white))
                .setTitle("点击")
                .setCircleColor(getResources().getColor(android.R.color.white))
                .setShape(ShowTipsView.SHAPE_CIRCLE)
                .setButtonText("OK")
                .setButtonBgColor(getResources().getColor(android.R.color.black))
                .setTarget(appointment)
               // .displayOneTime(0)
                .setDelay(0)
                .setCallback(new ShowTipsViewInterface() {
                    @Override
                    public void gotItClicked() {

                    }
                });
        ShowTipsView tipsView = tipsBuilder.build();
        tipsView.show(this);
    }
}
