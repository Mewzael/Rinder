package rinder.com;

import B.Z;
import I.V;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import g4.I;
import java.util.concurrent.atomic.AtomicInteger;
import l2.a;

/* loaded from: classes.dex */
public class MainActivity extends Z {

    /* renamed from: C  reason: collision with root package name */
    public static boolean f5692C;

    /* renamed from: Code  reason: collision with root package name */
    public String f5693Code;

    /* renamed from: V  reason: collision with root package name */
    public String f5694V;

    /* loaded from: classes.dex */
    public class Code extends ClickableSpan {
        public Code() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            MainActivity mainActivity = MainActivity.this;
            mainActivity.startActivity(new Intent(mainActivity, RegisterPageActivity.class));
            mainActivity.finish();
        }
    }

    @Override // androidx.fragment.app.m, androidx.activity.ComponentActivity, m.Z, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        V v2 = new V();
        a aVar = new a(this);
        StringBuilder sb = new StringBuilder("activity_rq#");
        AtomicInteger atomicInteger = ((ComponentActivity) this).f242Code;
        sb.append(atomicInteger.getAndIncrement());
        String sb2 = sb.toString();
        ComponentActivity.V v4 = ((ComponentActivity) this).f238Code;
        v4.I(sb2, this, v2, aVar);
        V v5 = new V();
        a0.Code code = new a0.Code(this);
        v4.I("activity_rq#" + atomicInteger.getAndIncrement(), this, v5, code).b(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
        I.f5143Code = new I(this);
        ((Button) findViewById(R.id.loginButton)).setOnClickListener(new l2.I(2, this));
        TextView textView = (TextView) findViewById(R.id.registerButton);
        String string = getResources().getString(R.string.registerText);
        SpannableString spannableString = new SpannableString(string);
        Code code2 = new Code();
        int indexOf = string.indexOf("here!");
        spannableString.setSpan(code2, indexOf, indexOf + 5, 0);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}