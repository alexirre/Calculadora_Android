package com.example.calculadora;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements OnClickListener{
	
	private Button btn0;
	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Button btn4;
	private Button btn5;
	private Button btn6;
	private Button btn7;
	private Button btn8;
	private Button btn9;
	private Button btnSuma;
	private Button btnResta;
	private Button btnMulti;
	private Button btnDiv;
	private Button btnIgual;
	private Button btnPunto;
	private Button btnBorrar;
	
	boolean decimal = false;
	boolean suma = false;
	boolean resta = false;
	boolean multi = false;
	boolean div = false;
	
	Double[] numero1 = new Double [20];
	Double resultado;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		this.btn0=(Button)findViewById(R.id.btn0);	
		this.btn1=(Button)findViewById(R.id.btn1);	
		this.btn2=(Button)findViewById(R.id.btn2);
		this.btn3=(Button)findViewById(R.id.btn3);	
		this.btn4=(Button)findViewById(R.id.btn4);
		this.btn5=(Button)findViewById(R.id.btn5);	
		this.btn6=(Button)findViewById(R.id.btn6);	
		this.btn7=(Button)findViewById(R.id.btn7);	
		this.btn8=(Button)findViewById(R.id.btn8);
		this.btn9=(Button)findViewById(R.id.btn9);	
		this.btnSuma=(Button)findViewById(R.id.btnSuma);	
		this.btnResta=(Button)findViewById(R.id.btnResta);	
		this.btnMulti=(Button)findViewById(R.id.btnMulti);	
		this.btnDiv=(Button)findViewById(R.id.btnDiv);	
		this.btnIgual=(Button)findViewById(R.id.btnIgual);	
		this.btnPunto=(Button)findViewById(R.id.btnPunto);
		this.btnBorrar=(Button)findViewById(R.id.btnBorrar);	
		
		btn0.setOnClickListener(this);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
		btn4.setOnClickListener(this);
		btn5.setOnClickListener(this);
		btn6.setOnClickListener(this);
		btn7.setOnClickListener(this);
		btn8.setOnClickListener(this);
		btn9.setOnClickListener(this);
		btnSuma.setOnClickListener(this);
		btnResta.setOnClickListener(this);
		btnMulti.setOnClickListener(this);
		btnDiv.setOnClickListener(this);
		btnIgual.setOnClickListener(this);
		btnPunto.setOnClickListener(this);
		btnBorrar.setOnClickListener(this);

	}

 public void onClick(View v){
	 
	 TextView numero = (TextView)findViewById(R.id.numero);
	 int seleccion = v.getId();
	 String a = numero.getText().toString();
	 
	 try{
	 switch(seleccion){
	 
	 case R.id.btn0:
		 numero.setText(a+"0");
		 break;
	 case R.id.btn1:
		 numero.setText(a+"1");
		 break;
	 case R.id.btn2:
		 numero.setText(a+"2");
		 break;
	 case R.id.btn3:
		 numero.setText(a+"3");
		 break;
	 case R.id.btn4:
		 numero.setText(a+"4");
		 break;
	 case R.id.btn5:
		 numero.setText(a+"5");
		 break;
	 case R.id.btn6:
		 numero.setText(a+"6");
		 break;
	 case R.id.btn7:
		 numero.setText(a+"7");
		 break;
	 case R.id.btn8:
		 numero.setText(a+"8");
		 break;
	 case R.id.btn9:
		 numero.setText(a+"9");
		 break;
	 case R.id.btnSuma:
		 suma = true;
		 numero1[0] = Double.parseDouble(a);
		 numero.setText("");
		 break;
	 case R.id.btnResta:
		 resta = true;
		 numero1[0] = Double.parseDouble(a);
		 numero.setText("");
		 break;
	 case R.id.btnMulti:
		 multi = true;
		 numero1[0] = Double.parseDouble(a);
		 numero.setText("");
		 break;
	 case R.id.btnDiv:
		 div = true;
		 numero1[0] = Double.parseDouble(a);
		 numero.setText("");
		 break;
	 case R.id.btnIgual:
		 numero1[1] = Double.parseDouble(a);
		 
		 if(suma == true){
			 resultado = numero1[0] + numero1[1];
			 numero.setText(String.valueOf(resultado));
					 
		 }else if(resta == true){
			 resultado = numero1[0] - numero1[1];
			 numero.setText(String.valueOf(resultado));
			 
		 }else if(multi == true){
			 resultado = numero1[0] * numero1[1];
			 numero.setText(String.valueOf(resultado));
			 
		 }else if(div == true){
			 resultado = numero1[0] / numero1[1];
			 numero.setText(String.valueOf(resultado));
			 
		 }
		 break;
	 case R.id.btnPunto:
		 if(decimal == false){
		 numero.setText(a+".");
		 decimal = true;
		 }else{return;}
		 break;
	 case R.id.btnBorrar:
		 numero.setText("");
		 break;
	 }
	 }catch(Exception e){
	 
	 numero.setText("Error");
     };
	 
 }
 

	
	
}
