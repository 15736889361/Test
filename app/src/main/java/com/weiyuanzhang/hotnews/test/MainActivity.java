package com.weiyuanzhang.hotnews.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * 排序算法例子
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_number;
    private Button btn_run;
    private String number;
    private int[] arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        initListener();
    }

    /**
     * 初始化监听
     */
    private void initListener() {
        btn_run.setOnClickListener(this);
    }

    /**
     * 初始化界面
     */
    public void initView() {
        tv_number = (TextView) findViewById(R.id.tv_number);
        btn_run = (Button) findViewById(R.id.btn_run);
    }

    /**
     * 初始化数据
     */
    public void initData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_run:
                arr = new int[]{5, 3, 9, 0, 1, 8, 4};
                SelectionSort(arr);
                break;
        }
    }

    /**
     * 选择排序
     * @param arr
     */
    private void SelectionSort(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
              int min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[min]>arr[j])
                    min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for (int i = 0; i < this.arr.length; i++) {
            number = number + String.valueOf(this.arr[i]);
        }
        tv_number.setText(number);
    }

    /**
     * 插入排序
     *
     * @param arr
     */
    private void InsertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] <= arr[j])
                    break;
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
        for (int i = 0; i < this.arr.length; i++) {
            number = number + String.valueOf(this.arr[i]);
        }
        tv_number.setText(number);
    }

    /**
     * 冒泡排序
     *
     * @param arr
     */
    public void BubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < this.arr.length - 1; i++) {
            for (int j = i + 1; j < this.arr.length; j++) {
                if (this.arr[i] > this.arr[j]) {
                    temp = this.arr[i];
                    this.arr[i] = this.arr[j];
                    this.arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < this.arr.length; i++) {
            number = number + String.valueOf(this.arr[i]);
        }
        tv_number.setText(number);
    }
}
