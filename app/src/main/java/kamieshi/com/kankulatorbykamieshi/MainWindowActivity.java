package kamieshi.com.kankulatorbykamieshi;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.TextView;
import java.util.logging.*;





public class MainWindowActivity extends AppCompatActivity {

    SaveValue TextBoxValue=new SaveValue();
   public TextView TextBox;
    boolean checkPoint=false;
    public FunctionCalculator fun=new FunctionCalculator();
    private static final Logger LOG = Logger.getLogger(MainWindowActivity.class.getName());


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_window);
        TextBox=(TextView) findViewById(R.id.TextBox);
        TextBox.setText(SaveValue.TextBox);
        LOG.info("Create Activity------------------------------------");

    }
public boolean checked()
{
    if(TextBox.getText().length()<14)return true;else return  false;
}

public void functionClick(View view) {
        checkPoint=false;
        TextBox.setText("");
        SaveValue.TextBox="";
    }

    public void clickOne(View view) {
        if(checked()){
            SaveValue.TextBox+="1";
        TextBox.setText(SaveValue.TextBox);}
    }

    public void clickTwo(View view) {
        if(checked()){SaveValue.TextBox+="2";
        TextBox.setText(SaveValue.TextBox);}
    }

    public void clickThree(View view) {
        if(checked()){SaveValue.TextBox+="3";
        TextBox.setText(SaveValue.TextBox);}
    }

    public void clickFore(View view) {
        if(checked()){SaveValue.TextBox+="4";
            TextBox.setText(SaveValue.TextBox);}
    }

    public void clickFive(View view) {
        if(checked()){SaveValue.TextBox+="5";
        TextBox.setText(SaveValue.TextBox);}
    }

    public void clickSix(View view) {
        if(checked()){SaveValue.TextBox+="6";
            TextBox.setText(SaveValue.TextBox);}
    }

    public void clickSeven(View view) {
        if(checked()){SaveValue.TextBox+="7";
            TextBox.setText(SaveValue.TextBox);}
    }

    public void clickEite(View view) {

        if(checked()){SaveValue.TextBox+="8";
            TextBox.setText(SaveValue.TextBox);}
    }

    public void clickFNine(View view) {

        if(checked()){SaveValue.TextBox+="9";
            TextBox.setText(SaveValue.TextBox);}
    }

    public void clickPoint(View view) {

        if(checked()){
            for(int i=0;i<SaveValue.TextBox.length();i++)
            {
                if(SaveValue.TextBox.charAt(i)=='.')
                {
                    checkPoint=true;
                }
            }
            if(checkPoint==false)
            {SaveValue.TextBox+=".";
            TextBox.setText(SaveValue.TextBox);}}
    }

    public void ClickZero(View view) {
        if(checked())
        {
            if(SaveValue.TextBox.length()==1&&SaveValue.TextBox.charAt(SaveValue.TextBox.length()-1)=='0'){}
            else{
                SaveValue.TextBox+="0";
                TextBox.setText(SaveValue.TextBox);

                ;}
        }
    }

    public  void  ClickPast(View view){
SaveValue.TextBox=SaveValue.SaveValue;
        TextBox.setText(SaveValue.TextBox);
    }

    public  void ClickSame(View view){

        SaveValue.last=Double.parseDouble(SaveValue.TextBox);
        TextBox.setText(Double.toString(fun.mainfunBinar(SaveValue.operationId,SaveValue.first,SaveValue.last)));
        SaveValue.TextBox = TextBox.getText().toString();
        SaveValue.first = Double.parseDouble(SaveValue.TextBox);
        LOG.info("-----------------RAVNO-------------------");
        LOG.info("operationID ::::::::");
        LOG.info(Integer.toString(SaveValue.operationId));
        LOG.info("first ::::::::");
        LOG.info(Double.toString( SaveValue.first));
        LOG.info("last ::::::::");
        LOG.info(Double.toString( SaveValue.last));

    }

    public  void ClickSumm(View view){
        SaveValue.operationId=1;
        SaveValue.first = Double.parseDouble(SaveValue.TextBox);
        SaveValue.TextBox="";
        TextBox.setText(SaveValue.TextBox);
        LOG.info("-----------------SUMMA-------------------");
        LOG.info("first ::::::::");
        LOG.info(Double.toString( SaveValue.first));
        LOG.info("last ::::::::");
        LOG.info(Double.toString( SaveValue.last));


    }

    public void CkickRazn(View view) {
        SaveValue.operationId=2;
        SaveValue.first = Double.parseDouble(SaveValue.TextBox);
        SaveValue.TextBox="";
        TextBox.setText(SaveValue.TextBox);
        LOG.info("-----------------RAZN-------------------");
        LOG.info("first ::::::::");
        LOG.info(Double.toString( SaveValue.first));
        LOG.info("last ::::::::");
        LOG.info(Double.toString( SaveValue.last));
    }

    public void ClickMultiplication(View view) {
        SaveValue.operationId=3;
        SaveValue.first = Double.parseDouble(SaveValue.TextBox);
        SaveValue.TextBox="";
        TextBox.setText(SaveValue.TextBox);
        LOG.info("-----------------UMNOJ-------------------");
        LOG.info("first ::::::::");
        LOG.info(Double.toString( SaveValue.first));
        LOG.info("last ::::::::");
        LOG.info(Double.toString( SaveValue.last));
    }

    public void ClickDivide(View view) {
        SaveValue.operationId=4;
        SaveValue.first = Double.parseDouble(SaveValue.TextBox);
        SaveValue.TextBox="";
        TextBox.setText(SaveValue.TextBox);
        LOG.info("-----------------DELENIE-------------------");
        LOG.info("first ::::::::");
        LOG.info(Double.toString( SaveValue.first));
        LOG.info("last ::::::::");
        LOG.info(Double.toString( SaveValue.last));
    }

    public void ClickPow(View view) {
        SaveValue.operationId=5;
        SaveValue.first = Double.parseDouble(SaveValue.TextBox);
        SaveValue.TextBox="";
        TextBox.setText(SaveValue.TextBox);
        LOG.info("-----------------STEPEN-------------------");
        LOG.info("first ::::::::");
        LOG.info(Double.toString( SaveValue.first));
        LOG.info("last ::::::::");
        LOG.info(Double.toString( SaveValue.last));
    }

    public void ClickPi(View view) {
        SaveValue.operationId=1;
        TextBox.setText(fun.mainfunUnar(SaveValue.operationId,SaveValue.first).toString());
        SaveValue.TextBox=TextBox.getText().toString();

    }

    public void clickCos(View view) {
        SaveValue.operationId=3;
        SaveValue.first=Double.parseDouble(SaveValue.TextBox);
        TextBox.setText(fun.mainfunUnar(SaveValue.operationId,SaveValue.first).toString());
        SaveValue.TextBox=TextBox.getText().toString();
        LOG.info("-----------------COS-------------------");
        LOG.info("first ::::::::");
        LOG.info(Double.toString( SaveValue.first));
        ;
    }

    public void clickSin(View view) {
        SaveValue.operationId=2;
        SaveValue.first=Double.parseDouble(SaveValue.TextBox);
        TextBox.setText(fun.mainfunUnar(SaveValue.operationId,SaveValue.first).toString());
        SaveValue.TextBox=TextBox.getText().toString();
        LOG.info("-----------------SIN-------------------");
        LOG.info("first ::::::::");
        LOG.info(Double.toString( SaveValue.first));

    }

    public void ClickSrc(View view) {
        SaveValue.operationId=4;
        SaveValue.first=Double.parseDouble((SaveValue.TextBox));
        TextBox.setText(fun.mainfunUnar(SaveValue.operationId,SaveValue.first).toString());
        SaveValue.TextBox=TextBox.getText().toString();
        LOG.info("-----------------KOREN-------------------");
        LOG.info("first ::::::::");
        LOG.info(Double.toString( SaveValue.first));
        ;

    }

    public void ClickSave(View view) {
        SaveValue.SaveValue=SaveValue.TextBox;
        SaveValue.TextBox="";
        TextBox.setText(SaveValue.TextBox);
    }

    public void ClickPlasMin(View view) {
        Double temp = Double.parseDouble((SaveValue.TextBox))*-1;
        SaveValue.TextBox=temp.toString();
        TextBox.setText(SaveValue.TextBox);
    }
}
