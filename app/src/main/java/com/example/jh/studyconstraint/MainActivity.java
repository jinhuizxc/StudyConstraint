package com.example.jh.studyconstraint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * 全面学习ConstraintLayout: 约束布局
 *
 * 具体细节：
 * Button1:app:layout_constraintBottom_toTopOf="@id/iv_head"
 * 我们把这个属性拆开来看，
 * constraintBottom 指的本身的底部，即 Button1 的底部， toTopOf 是指 ImageView 的顶部，那么这句话的意思就是
 * Aligns the bottom of the desired view to the top of another.（官方原文）
 * 翻译一下就是 Button1 的底部要和 ImageView 的顶部对齐
 * Button1 app:layout_constraintRight_toLeftOf="@id/iv_head"
 * 根据上面的规则我们就知道 Button1 的右边要和 ImageView 的左边对齐。
 * 其实很简单就是说两个 View 的某个方位要对齐
 * 没了，就这么简单，其它属性可以举一反三，它比 RelativeLayout 控制起来更加得以就手。
 * layout_constraintTop_toTopOf  —  Align the top of the desired view to the top of another.
 * layout_constraintTop_toBottomOf  —  Align the top of the desired view to the bottom of another.
 * layout_constraintBottom_toTopOf  —  Align the bottom of the desired view to the top of another.
 * layout_constraintBottom_toBottomOf  —  Align the bottom of the desired view to the bottom of another.
 * layout_constraintLeft_toTopOf  —  Align the left of the desired view to the top of another.
 * layout_constraintLeft_toBottomOf  —  Align the left of the desired view to the bottom of another.
 * layout_constraintLeft_toLeftOf  —  Align the left of the desired view to the left of another.
 * layout_constraintLeft_toRightOf  —  Align the left of the desired view to the right of another.
 * layout_constraintRight_toTopOf  —  Align the right of the desired view to the top of another.
 * layout_constraintRight_toBottomOf  —  Align the right of the desired view to the bottom of another.
 * layout_constraintRight_toLeftOf  —  Align the right of the desired view to the left of another.
 * layout_constraintRight_toRightOf  —  Align the right of the desired view to the right of another.
 * If desired, attributes supporting start and end are also available in place of left and right alignment.
 * 到此，你已经掌握了一大半的 ConstraintLayout 知识点
 * 还有其它的一些属性
 * app:layout_constraintStart_toEndOf
 * 意思就是 Button 的开始部分（从左往右看，开始部分就是 Button 的左边）与 ImageView 的右边是对齐的。
 * app:layout_constraintStart_toStartOf
 * 这个就是说 Button 的左边与 ImageView 的左边是对齐的
 * 不知道为什么上面已经出的属性能够满足布局需要了，为什么还要再出 start 和 end 的。
 */
public class MainActivity extends AppCompatActivity {

    /**
     *  second Acrivity 布局设计有技巧哦
     *  参见博客：http://blog.csdn.net/jinhui157/article/details/72934038
     *  接下来我们先将各个控件按照界面设计的位置进行摆放，
     *
     *  摆放完成之后点击一下工具栏上的Infer Constraints按钮，就能为所有控件自动添加约束了
     *
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }
}
