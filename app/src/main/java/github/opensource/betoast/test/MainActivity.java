package github.opensource.betoast.test;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import github.opensource.betoast.BeToastUtil;

/**
 * Project :  Betoastmaster.
 * Package name: github.opensource.betoast.test
 * Created by :  Benjamin.
 * Created time: 2017/10/29 0:50
 * Changed by :  Benjamin.
 * Changed time: 2017/10/29 0:50
 * Class description:
 */

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);
        findViewById(R.id.button7).setOnClickListener(this);
        findViewById(R.id.button8).setOnClickListener(this);
        findViewById(R.id.button9).setOnClickListener(this);
        findViewById(R.id.button10).setOnClickListener(this);
        findViewById(R.id.button0).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button0:
                Toast.makeText(this, "普通的弹窗", Toast.LENGTH_LONG).show();
                break;
            case R.id.button1:
                BeToastUtil.showDownToast(this, "toast显示download弹窗");
                break;
            case R.id.button2:
                BeToastUtil.showWaringToast(this, "toast显示warning弹窗");
                break;
            case R.id.button3:
                BeToastUtil.showErrorToast(this, "toast显示error弹窗");
                break;
            case R.id.button4:
                BeToastUtil.showInfoToast(this, "toast显示info弹窗");
                break;
            case R.id.button5:
                BeToastUtil.showDefaultToast(this, "toast显示default弹窗");
                break;
            case R.id.button6:
                BeToastUtil.showConfusionToast(this, "toast显示confusion弹窗");
                break;
            case R.id.button7:
                BeToastUtil.showCustomerSnaker(this, "toast显示自定义snaker弹窗");
                break;
            case R.id.button8:
                BeToastUtil.showSuccessSnaker(this, "toast显示success弹窗");
                break;
            case R.id.button9:
                BeToastUtil.showErrorSnaker(this, "toast显示faild弹窗");
                break;
            case R.id.button10:
                BeToastUtil.showInfoSnaker(this, "toast显示info弹窗");
                break;
            default:
                break;

        }
    }
}
