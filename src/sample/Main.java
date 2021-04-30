// Ravishan Lakshitha Premarathne
// w1790297
//20191034


package sample;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import java.io.*;



public class Main extends Application {
    Pane hbox1;
    Pane help;
    Scene scene1;
    Scene scene2;
    Scene scene3;
    Stage stage;

    Button help_button = new Button(" \uD83D\uDEC8 Help");



    //mortage text field
    TextField morttextF_1 =new TextField();
    TextField morttextF_2 =new TextField();
    TextField morttextF_3 =new TextField();
    TextField morttextF_4 =new TextField();



    //finance text fields
    //future value tab
    TextField fV_textF_1 =new TextField();
    TextField fV_textF_2 =new TextField();
    TextField fV_textF_3 =new TextField();
    TextField fV_textF_4 =new TextField();
    //annual payment textfileds
    TextField PeriodPay_textF_1 =new TextField();
    TextField PeriodPay_textF_2 =new TextField();
    TextField PeriodPay_textF_3 =new TextField();
    TextField PeriodPay_textF_4 =new TextField();

    //intrest rate textfileds
    TextField intrestRate_textF_1 =new TextField();
    TextField intrestRate_textF_2 =new TextField();
    TextField intrestRate_textF_3 =new TextField();
    TextField intrestRate_textF_4 =new TextField();

    // Annual payments  textfileds

    TextField annualPayment_textF_1 =new TextField();
    TextField annualPayment_textF_2 =new TextField();
    TextField annualPayment_textF_3 =new TextField();
    TextField annualPayment_textF_4 =new TextField();
    //starting principal text fields

    TextField startingPrincipal_textF_1 =new TextField();
    TextField startingPrincipal_textF_2 =new TextField();
    TextField startingPrincipal_textF_3 =new TextField();
    TextField startingPrincipal_textF_4 =new TextField();
    // loan main pane text fields layouts
    //monthly pay tab text field
    TextField  mothlyPay_textF_1 =new TextField();
    TextField  mothlyPay_textF_2 =new TextField();
    TextField  mothlyPay_textF_3 =new TextField();
    TextField  mothlyPay_textF_4 =new TextField();
    TextField  mothlyPay_textF_5 =new TextField();
    //auto loan
    TextField  autoloan_textF_1 =new TextField();
    TextField  autoloan_textF_2 =new TextField();
    TextField  autoloan_textF_3 =new TextField();
    TextField  autoloan_textF_4 =new TextField();
    TextField  autoloan_textF_5 =new TextField();

    //compound Intrest
    TextField  compoint_textF_1 =new TextField();
    TextField  compoint_textF_2 =new TextField();
    TextField  compoint_textF_3 =new TextField();
    TextField  compoint_textF_4 =new TextField();



    @Override
    public void start(Stage primaryStage) throws IOException {







        //key board Arry-----------------------------------
        TextField[] keyboardArry = new TextField[1];




// MORTGAGE TEXT FIELDS LAYOUTS

        morttextF_1.setLayoutX(300);
        morttextF_1.setLayoutY(100);
        morttextF_1.setPromptText("$");
        morttextF_1.setOnMouseClicked(e -> {keyboardArry[0]=morttextF_1;});


        morttextF_2.setLayoutX(300);
        morttextF_2.setLayoutY(150);
        morttextF_2.setPromptText("%");
        morttextF_2.setOnMouseClicked(e -> {keyboardArry[0]=morttextF_2;});


        morttextF_3.setLayoutX(300);
        morttextF_3.setLayoutY(200);
        morttextF_3.setPromptText("Years");
        morttextF_3.setOnMouseClicked(e -> {keyboardArry[0]=morttextF_3;});


        morttextF_4.setLayoutX(300);
        morttextF_4.setLayoutY(250);
        morttextF_4.setPromptText("%");
        morttextF_4.setOnMouseClicked(e -> {keyboardArry[0]=morttextF_4;});



        //FINANCE TEXT FIELD LAYOUTS
        //future values

        fV_textF_1.setLayoutX(300);
        fV_textF_1.setLayoutY(100);
        fV_textF_1.setOnMouseClicked(e -> {keyboardArry[0]=fV_textF_1;});



        fV_textF_2.setLayoutX(300);
        fV_textF_2.setLayoutY(150);
        fV_textF_2.setPromptText("$");
        fV_textF_2.setOnMouseClicked(e -> {keyboardArry[0]=fV_textF_2;});


        fV_textF_3.setLayoutX(300);
        fV_textF_3.setLayoutY(200);
        fV_textF_3.setPromptText("%");
        fV_textF_3.setOnMouseClicked(e -> {keyboardArry[0]=fV_textF_3;});

        fV_textF_4.setLayoutX(300);
        fV_textF_4.setLayoutY(250);
        fV_textF_4.setPromptText("$");
        fV_textF_4.setOnMouseClicked(e -> {keyboardArry[0]=fV_textF_4;});


        //Period payment textfield layout
        PeriodPay_textF_1.setLayoutX(300);
        PeriodPay_textF_1.setLayoutY(100);
        PeriodPay_textF_1.setPromptText("%");
        PeriodPay_textF_1.setOnMouseClicked(e -> {keyboardArry[0]=PeriodPay_textF_1;});

        PeriodPay_textF_2.setLayoutX(300);
        PeriodPay_textF_2.setLayoutY(150);
        PeriodPay_textF_2.setPromptText("$");
        PeriodPay_textF_2.setOnMouseClicked(e -> {keyboardArry[0]=PeriodPay_textF_2;});

        PeriodPay_textF_3.setLayoutX(300);
        PeriodPay_textF_3.setLayoutY(200);
        PeriodPay_textF_3.setPromptText("$");
        PeriodPay_textF_3.setOnMouseClicked(e -> {keyboardArry[0]=PeriodPay_textF_3;});


        PeriodPay_textF_4.setLayoutX(300);
        PeriodPay_textF_4.setLayoutY(250);
        PeriodPay_textF_4.setPromptText("$");
        PeriodPay_textF_4.setOnMouseClicked(e -> {keyboardArry[0]=PeriodPay_textF_4;});


        //intrest rate text field layout

        intrestRate_textF_1.setLayoutX(300);
        intrestRate_textF_1.setLayoutY(100);
        intrestRate_textF_1.setOnMouseClicked(e -> {keyboardArry[0]=intrestRate_textF_1;});



        intrestRate_textF_2.setLayoutX(300);
        intrestRate_textF_2.setLayoutY(150);
        intrestRate_textF_2.setPromptText("$");
        intrestRate_textF_2.setOnMouseClicked(e -> {keyboardArry[0]=intrestRate_textF_2;});

        intrestRate_textF_3.setLayoutX(300);
        intrestRate_textF_3.setLayoutY(200);
        intrestRate_textF_3.setPromptText("$");
        intrestRate_textF_3.setOnMouseClicked(e -> {keyboardArry[0]=intrestRate_textF_3;});

        intrestRate_textF_4.setLayoutX(300);
        intrestRate_textF_4.setLayoutY(250);
        intrestRate_textF_4.setPromptText("$");
        intrestRate_textF_4.setOnMouseClicked(e -> {keyboardArry[0]=intrestRate_textF_4;});

        //Annual payment text fieldlayout

        annualPayment_textF_1.setLayoutX(300);
        annualPayment_textF_1.setLayoutY(100);
        annualPayment_textF_1.setPromptText("months");
        annualPayment_textF_1.setOnMouseClicked(e -> {keyboardArry[0]=annualPayment_textF_1;});


        annualPayment_textF_2.setLayoutX(300);
        annualPayment_textF_2.setLayoutY(150);
        annualPayment_textF_2.setPromptText("$");
        annualPayment_textF_2.setOnMouseClicked(e -> {keyboardArry[0]=annualPayment_textF_2;});

        annualPayment_textF_3.setLayoutX(300);
        annualPayment_textF_3.setLayoutY(200);
        annualPayment_textF_3.setPromptText("%");
        annualPayment_textF_3.setOnMouseClicked(e -> {keyboardArry[0]=annualPayment_textF_3;});

        annualPayment_textF_4.setLayoutX(300);
        annualPayment_textF_4.setLayoutY(250);
        annualPayment_textF_4.setPromptText("$");
        annualPayment_textF_4.setOnMouseClicked(e -> {keyboardArry[0]=annualPayment_textF_4;});


        //starting principal text field layouts

        startingPrincipal_textF_1.setLayoutX(300);
        startingPrincipal_textF_1.setLayoutY(100);
        startingPrincipal_textF_1.setPromptText("months");
        startingPrincipal_textF_1.setOnMouseClicked(e -> {keyboardArry[0]=startingPrincipal_textF_1;});




        startingPrincipal_textF_2.setLayoutX(300);
        startingPrincipal_textF_2.setLayoutY(150);
        startingPrincipal_textF_2.setPromptText("$");
        startingPrincipal_textF_2.setOnMouseClicked(e -> {keyboardArry[0]=startingPrincipal_textF_2;});



        startingPrincipal_textF_3.setLayoutX(300);
        startingPrincipal_textF_3.setLayoutY(200);
        startingPrincipal_textF_3.setPromptText("%");
        startingPrincipal_textF_3.setOnMouseClicked(e -> {keyboardArry[0]=startingPrincipal_textF_3;});



        startingPrincipal_textF_4.setLayoutX(300);
        startingPrincipal_textF_4.setLayoutY(250);
        startingPrincipal_textF_4.setPromptText("$");
        startingPrincipal_textF_4.setOnMouseClicked(e -> {keyboardArry[0]=startingPrincipal_textF_4;});

// loan main pane text fields layouts
        //monthly pay tab text field

        mothlyPay_textF_1.setLayoutX(300);
        mothlyPay_textF_1.setLayoutY(100);
        mothlyPay_textF_1.setPromptText("$");
        mothlyPay_textF_1.setOnMouseClicked(e -> {keyboardArry[0]= mothlyPay_textF_1;});


        mothlyPay_textF_2.setLayoutX(300);
        mothlyPay_textF_2.setLayoutY(150);
        mothlyPay_textF_2.setPromptText("months");
        mothlyPay_textF_2.setOnMouseClicked(e -> {keyboardArry[0]= mothlyPay_textF_2;});


        mothlyPay_textF_3.setLayoutX(300);
        mothlyPay_textF_3.setLayoutY(200);
        mothlyPay_textF_3.setPromptText("%");
        mothlyPay_textF_3.setOnMouseClicked(e -> {keyboardArry[0]= mothlyPay_textF_3;});


        mothlyPay_textF_4.setLayoutX(300);
        mothlyPay_textF_4.setLayoutY(250);
        mothlyPay_textF_4.setPromptText("$");
        mothlyPay_textF_4.setOnMouseClicked(e -> {keyboardArry[0]= mothlyPay_textF_4;});


        mothlyPay_textF_5.setLayoutX(300);
        mothlyPay_textF_5.setLayoutY(300);
        mothlyPay_textF_5.setPromptText("%");
        mothlyPay_textF_5.setOnMouseClicked(e -> {keyboardArry[0]= mothlyPay_textF_5;});


        // auto loan
        autoloan_textF_1.setLayoutX(300);
        autoloan_textF_1.setLayoutY(100);
        autoloan_textF_1.setPromptText("$");
        autoloan_textF_1.setOnMouseClicked(e -> {keyboardArry[0]= autoloan_textF_1;});


        autoloan_textF_2.setLayoutX(300);
        autoloan_textF_2.setLayoutY(150);
        autoloan_textF_2.setPromptText("Months");
        autoloan_textF_2.setOnMouseClicked(e -> {keyboardArry[0]= autoloan_textF_2;});

        autoloan_textF_3.setLayoutX(300);
        autoloan_textF_3.setLayoutY(200);
        autoloan_textF_3.setPromptText("%");
        autoloan_textF_3.setOnMouseClicked(e -> {keyboardArry[0]= autoloan_textF_3;});

        autoloan_textF_4.setLayoutX(300);
        autoloan_textF_4.setLayoutY(250);
        autoloan_textF_4.setPromptText("$");
        autoloan_textF_4.setOnMouseClicked(e -> {keyboardArry[0]= autoloan_textF_4;});

        autoloan_textF_5.setLayoutX(300);
        autoloan_textF_5.setLayoutY(300);
        autoloan_textF_5.setPromptText("%");
        autoloan_textF_5.setOnMouseClicked(e -> {keyboardArry[0]= autoloan_textF_5;});
        //compound inrest----------
        compoint_textF_1.setLayoutX(300);
        compoint_textF_1.setLayoutY(100);
        compoint_textF_1.setPromptText("$");
        compoint_textF_1.setOnMouseClicked(e -> {keyboardArry[0]= compoint_textF_1;});


        compoint_textF_2.setLayoutX(300);
        compoint_textF_2.setLayoutY(150);
        compoint_textF_2.setPromptText("$");
        compoint_textF_2.setOnMouseClicked(e -> {keyboardArry[0]= compoint_textF_2;});

        compoint_textF_3.setLayoutX(300);
        compoint_textF_3.setLayoutY(200);
        compoint_textF_3.setPromptText("%");
        compoint_textF_3.setOnMouseClicked(e -> {keyboardArry[0]= compoint_textF_3;});


        compoint_textF_4.setLayoutX(300);
        compoint_textF_4.setLayoutY(250);
        compoint_textF_4.setPromptText("years");
        compoint_textF_4.setOnMouseClicked(e -> {keyboardArry[0]= compoint_textF_4;});


        //compount intrest pane buttons-


        Button comp_calculate = new Button("Calculate");
        comp_calculate.setLayoutX(300);
        comp_calculate.setLayoutY(400);
        comp_calculate.setStyle("-fx-background-color: white; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 50,0; ");

        Button comp_clear = new Button("Clear");
        comp_clear.setLayoutX(400);
        comp_clear.setLayoutY(400);
        comp_clear.setStyle("-fx-background-color: white; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 50,0; ");



        //mortgage Pane buttons
        Button mort_calculate = new Button("Calculate");
        mort_calculate.setLayoutX(300);
        mort_calculate.setLayoutY(400);
        mort_calculate.setStyle("-fx-background-color: white; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 50,0; ");

        Button mort_clear = new Button("Clear");
        mort_clear.setLayoutX(400);
        mort_clear.setLayoutY(400);
        mort_clear.setStyle("-fx-background-color: white; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 50,0; ");

        //finnace Pane buttons
        //Future value
        Button fv_calculateB = new Button("Calculate");
        fv_calculateB.setLayoutX(300);
        fv_calculateB.setLayoutY(400);
        fv_calculateB.setStyle("-fx-background-color: white; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 50,0; ");



        Button fv_clearB = new Button("Clear");
        fv_clearB.setLayoutX(400);
        fv_clearB.setLayoutY(400);
        fv_clearB.setStyle("-fx-background-color: white; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 50,0; ");


        //periodic Payments
        Button Periodic_calculateB = new Button("Calculate");
        Periodic_calculateB.setLayoutX(300);
        Periodic_calculateB.setLayoutY(400);
        Periodic_calculateB.setStyle("-fx-background-color: white; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 50,0; ");


        Button Periodic_clearB = new Button("Clear");
        Periodic_clearB.setLayoutX(400);
        Periodic_clearB.setLayoutY(400);
        Periodic_clearB.setStyle("-fx-background-color: white; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 50,0; ");


        //interest Rate
        Button Intrest_calculateB = new Button("Calculate");
        Intrest_calculateB.setLayoutX(300);
        Intrest_calculateB.setLayoutY(400);
        Intrest_calculateB.setStyle("-fx-background-color: white; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 50,0; ");


        Button Intrest_clearB = new Button("Clear");
        Intrest_clearB.setLayoutX(400);
        Intrest_clearB.setLayoutY(400);
        Intrest_clearB.setStyle("-fx-background-color: white; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 50,0; ");


        //annual payment
        Button annualpay_calculateB = new Button("Calculate");
        annualpay_calculateB.setLayoutX(300);
        annualpay_calculateB.setLayoutY(400);
        annualpay_calculateB.setStyle("-fx-background-color: white; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 50,0; ");


        Button annualpay_clearB = new Button("Clear");
        annualpay_clearB.setLayoutX(400);
        annualpay_clearB.setLayoutY(400);
        annualpay_clearB.setStyle("-fx-background-color: white; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 50,0; ");


        //Starting principle
        Button StartingPrin_calculateB = new Button("Calculate");
        StartingPrin_calculateB.setLayoutX(300);
        StartingPrin_calculateB.setLayoutY(400);
        StartingPrin_calculateB.setStyle("-fx-background-color: white; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 50,0; ");


        Button StartingPrin_clearB = new Button("Clear");
        StartingPrin_clearB.setLayoutX(400);
        StartingPrin_clearB.setLayoutY(400);
        StartingPrin_clearB.setStyle("-fx-background-color: white; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 50,0; ");


//Loan pane buttons
        //monthlypay
        Button monthlypay_calculateB = new Button("Calculate");
        monthlypay_calculateB.setLayoutX(300);
        monthlypay_calculateB.setLayoutY(400);
        monthlypay_calculateB.setStyle("-fx-background-color: white; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 50,0; ");


        Button monthlypay_clearB = new Button("Clear");
        monthlypay_clearB.setLayoutX(400);
        monthlypay_clearB.setLayoutY(400);
        monthlypay_clearB.setStyle("-fx-background-color: white; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 50,0; ");


        //auto loan
        Button autoLoan_calculateB = new Button("Calculate");
        autoLoan_calculateB.setLayoutX(300);
        autoLoan_calculateB.setLayoutY(400);
        autoLoan_calculateB.setStyle("-fx-background-color: white; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 50,0; ");


        Button autoLoan_clearB = new Button("Clear");
        autoLoan_clearB.setLayoutX(400);
        autoLoan_clearB.setLayoutY(400);
        autoLoan_clearB.setStyle("-fx-background-color: white; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 50,0; ");



//-----------------------Labels-----------------------------------------------------------------------------

//Label styling ---
        String fieldlbl = " -fx-font: 20px Tahoma;-fx-text-fill: white;";
        String hightlight= "-fx-background-color: #fdcc05; -fx-font:  20px Tahoma;-fx-text-fill: white;";

        primaryStage.setTitle("FINANCIAL CALCULATOR");

        // compound intres Labels

//  label compound intrest calculator
        Label comp_Principal = new Label("Starting Principal");
        comp_Principal.setLayoutX(30);
        comp_Principal.setLayoutY(100);
        comp_Principal.setStyle(fieldlbl);

        Label comp_annual= new Label("Annual Contribution");
        comp_annual.setLayoutX(30);
        comp_annual.setLayoutY(150);
        comp_annual.setStyle(fieldlbl);

        Label comp_interest = new Label ("Interest Rate");
        comp_interest.setLayoutX(30);
        comp_interest.setLayoutY(200);
        comp_interest.setStyle(fieldlbl);

        Label comp_years = new Label ("Years");
        comp_years.setLayoutX(30);
        comp_years.setLayoutY(250);
        comp_years.setStyle(fieldlbl);



        // output labels mortgage


        Label complbl1 = new Label("End Balance");
        complbl1.setLayoutX(700);
        complbl1.setLayoutY(100);
        complbl1.setStyle(hightlight);

        Label complbl2= new Label("Total Principal");
        complbl2.setLayoutX(700);
        complbl2.setLayoutY(150);
        complbl2.setStyle(fieldlbl);
        Label  complbl3= new Label ("Total Intrest");
        complbl3.setLayoutX(700);
        complbl3.setLayoutY(200);
        complbl3.setStyle(fieldlbl);





//making label  content in to tabs #headings
        Label top_mor = new Label(" MORTGAGE CALCULATOR");
        top_mor.setLayoutX(400);
        top_mor.setLayoutY(50);
//  label mortgage calculator
        Label home_price = new Label("Home Price");
        home_price.setLayoutX(30);
        home_price.setLayoutY(100);
        home_price.setStyle(fieldlbl);
        Label down_payment= new Label("Down Playment");
        down_payment.setLayoutX(30);
        down_payment.setLayoutY(150);
        down_payment.setStyle(fieldlbl);

        Label loan_term = new Label ("Loan Term");
        loan_term.setLayoutX(30);
        loan_term.setLayoutY(200);
        loan_term.setStyle(fieldlbl);
        Label interest_rate =new Label("Interest Rate");
        interest_rate.setLayoutX(30);
        interest_rate.setLayoutY(250);
        interest_rate.setStyle(fieldlbl);

        // output labels mortgage


        Label MortmonthlyPaylbl1 = new Label("Monthly Pay");
        MortmonthlyPaylbl1.setLayoutX(700);
        MortmonthlyPaylbl1.setLayoutY(100);
        MortmonthlyPaylbl1.setStyle(hightlight);

        Label MorthousePricelbl2= new Label("House Price");
        MorthousePricelbl2.setLayoutX(700);
        MorthousePricelbl2.setLayoutY(150);
        MorthousePricelbl2.setStyle(fieldlbl);
        Label  MortloanAmoulbl3= new Label ("Loan Amount");
        MortloanAmoulbl3.setLayoutX(700);
        MortloanAmoulbl3.setLayoutY(200);
        MortloanAmoulbl3.setStyle(fieldlbl);

        Label MortdownPaymentlbl4 =new Label("Down Payment");
        MortdownPaymentlbl4.setLayoutX(700);
        MortdownPaymentlbl4.setLayoutY(250);
        MortdownPaymentlbl4.setStyle(fieldlbl);
        Label MortTotalmortaggepaymentlbl5 =new Label("Total Mortagage Payment");
        MortTotalmortaggepaymentlbl5.setLayoutX(700);
        MortTotalmortaggepaymentlbl5.setLayoutY(300);
        MortTotalmortaggepaymentlbl5.setStyle(fieldlbl);
        Label MorttotalIntrestlbl6 =new Label("Total interest");
        MorttotalIntrestlbl6.setLayoutX(700);
        MorttotalIntrestlbl6.setLayoutY(350);
        MorttotalIntrestlbl6.setStyle(fieldlbl);


        //finance calculator labels
        //future value tab lables

        Label fv_Noofperiads = new Label("Number of Periods");
        fv_Noofperiads.setLayoutX(30);
        fv_Noofperiads.setLayoutY(100);
        fv_Noofperiads.setStyle(fieldlbl);

        Label fv_StartPrincipal= new Label("Start Principal ");
        fv_StartPrincipal.setLayoutX(30);
        fv_StartPrincipal.setLayoutY(150);
        fv_StartPrincipal.setStyle(fieldlbl);
        Label fv_interestRate = new Label ("Interest Rate I/Y");
        fv_interestRate.setLayoutX(30);
        fv_interestRate.setLayoutY(200);
        fv_interestRate.setStyle(fieldlbl);
        Label fv_annuityPayment =new Label("Annuity Payment (PMT)");
        fv_annuityPayment .setLayoutX(30);
        fv_annuityPayment .setLayoutY(250);
        fv_annuityPayment.setStyle(fieldlbl);



        // future value output lablel
        Label fvResultlbl0 = new Label("  Result  ");
        fvResultlbl0 .setLayoutX(700);
        fvResultlbl0 .setLayoutY(50);
        fvResultlbl0.setStyle(fieldlbl);
        Label fvFuturelbl1 =         new Label("FV(Future Value)");
        fvFuturelbl1.setLayoutX(700);
        fvFuturelbl1.setLayoutY(100);
        fvFuturelbl1.setStyle(hightlight);
        Label fvPresentvaluelbl2=    new Label("PV(Present Value)");
        fvPresentvaluelbl2.setLayoutX(700);
        fvPresentvaluelbl2.setLayoutY(150);
        fvPresentvaluelbl2.setStyle(fieldlbl);
        Label  fvNumberPeriodslbl3=  new Label ("N(Number)");
        fvNumberPeriodslbl3.setLayoutX(700);
        fvNumberPeriodslbl3.setLayoutY(200);
        fvNumberPeriodslbl3.setStyle(fieldlbl);
        Label fvIntrestRatelbl4 =    new Label("I/Y(Interest Rate)");
        fvIntrestRatelbl4.setLayoutX(700);
        fvIntrestRatelbl4.setLayoutY(250);
        fvIntrestRatelbl4.setStyle(fieldlbl);
        Label fvPeriodiclbl5 =       new Label("PMT (Periodic Payment)");
        fvPeriodiclbl5.setLayoutX(700);
        fvPeriodiclbl5.setLayoutY(300);
        fvPeriodiclbl5.setStyle(fieldlbl);
        Label fvStarinveslbl6 =      new Label("Starting Investment");
        fvStarinveslbl6.setLayoutX(700);
        fvStarinveslbl6.setLayoutY(350);
        fvStarinveslbl6.setStyle(fieldlbl);
        Label fvTolalPrinlbl7 =      new Label("Total Principal");
        fvTolalPrinlbl7.setLayoutX(700);
        fvTolalPrinlbl7.setLayoutY(400);
        fvTolalPrinlbl7.setStyle(fieldlbl);



        // period payment tab

        Label PeriodPay_futureValue = new Label("Interest Rate");
        PeriodPay_futureValue.setLayoutX(30);
        PeriodPay_futureValue.setLayoutY(100);
        PeriodPay_futureValue.setStyle(fieldlbl);

        Label PeriodPay_startPrinciple= new Label("Start Principal");
        PeriodPay_startPrinciple.setLayoutX(30);
        PeriodPay_startPrinciple.setLayoutY(150);
        PeriodPay_startPrinciple.setStyle(fieldlbl);

        Label PeriodPay_numberofperiods= new Label("Annual Payments");
        PeriodPay_numberofperiods.setLayoutX(30);
        PeriodPay_numberofperiods.setLayoutY(200);
        PeriodPay_numberofperiods.setStyle(fieldlbl);;

        Label PeriodPay_interestRate = new Label ("Future Value");
        PeriodPay_interestRate.setLayoutX(30);
        PeriodPay_interestRate.setLayoutY(250);
        PeriodPay_interestRate.setStyle(fieldlbl);

        // period payment output
        Label PreResultlbl0 = new Label("  Result  ");
        PreResultlbl0 .setLayoutX(700);
        PreResultlbl0 .setLayoutY(50);
        PreResultlbl0.setStyle(fieldlbl);
        Label PreFuturelbl1 =         new Label("FV(Future Value)");
        PreFuturelbl1.setLayoutX(700);
        PreFuturelbl1.setLayoutY(300);
        PreFuturelbl1.setStyle(fieldlbl);
        Label PrePresentvaluelbl2=    new Label("PV(Present Value)");
        PrePresentvaluelbl2.setLayoutX(700);
        PrePresentvaluelbl2.setLayoutY(150);
        PrePresentvaluelbl2.setStyle(fieldlbl);
        Label  PreNumberPeriodslbl3=  new Label ("N(Number)");
        PreNumberPeriodslbl3.setLayoutX(700);
        PreNumberPeriodslbl3.setLayoutY(200);
        PreNumberPeriodslbl3.setStyle(fieldlbl);
        Label PreIntrestRatelbl4 =    new Label("I/Y(Interest Rate)");
        PreIntrestRatelbl4.setLayoutX(700);
        PreIntrestRatelbl4.setLayoutY(250);
        PreIntrestRatelbl4.setStyle(fieldlbl);
        Label PrePeriodiclbl5 =       new Label("PMT (Periodic Paymrnt)");
        PrePeriodiclbl5.setLayoutX(700);
        PrePeriodiclbl5.setLayoutY(100);
        PrePeriodiclbl5.setStyle(fieldlbl);
        PrePeriodiclbl5.setStyle(hightlight);
        Label PreStarinveslbl6 =      new Label("Starting Investment");
        PreStarinveslbl6.setLayoutX(700);
        PreStarinveslbl6.setLayoutY(350);
        PreStarinveslbl6.setStyle(fieldlbl);
        Label PreTolalPrinlbl7 =      new Label("Total Principal");
        PreTolalPrinlbl7.setLayoutX(700);
        PreTolalPrinlbl7.setLayoutY(400);
        PreTolalPrinlbl7.setStyle(fieldlbl);
        Label PreTolalIntlbl8 = new Label("Total Intrest");
        PreTolalIntlbl8.setLayoutX(700);
        PreTolalIntlbl8.setLayoutY(450);
        PreTolalIntlbl8.setStyle(fieldlbl);


        // intrest rate tab labels

        Label intrestRate_numberofperiods = new Label("Number of Periods");
        intrestRate_numberofperiods.setLayoutX(30);
        intrestRate_numberofperiods.setLayoutY(100);
        intrestRate_numberofperiods.setStyle(fieldlbl);

        Label intrestRate_startPrinciple= new Label("Start Principal");
        intrestRate_startPrinciple.setLayoutX(30);
        intrestRate_startPrinciple.setLayoutY(150);
        intrestRate_startPrinciple.setStyle(fieldlbl);


        Label intrestRate_annnualpayments= new Label("Annual Payments");
        intrestRate_annnualpayments.setLayoutX(30);
        intrestRate_annnualpayments.setLayoutY(200);
        intrestRate_annnualpayments.setStyle(fieldlbl);

        Label intrestRate_futureValue = new Label ("Future Value");
        intrestRate_futureValue.setLayoutX(30);
        intrestRate_futureValue.setLayoutY(250);
        intrestRate_futureValue.setStyle(fieldlbl);
        //intrest output
        Label intResultlbl0 = new Label("  Result  ");
        intResultlbl0 .setLayoutX(700);
        intResultlbl0 .setLayoutY(50);
        intResultlbl0.setStyle(fieldlbl);

        Label  intNumberPeriodslbl3=  new Label ("N(Number)");
        intNumberPeriodslbl3.setLayoutX(700);
        intNumberPeriodslbl3.setLayoutY(150);
        intNumberPeriodslbl3.setStyle(fieldlbl);
        Label intIntrestRatelbl4 =    new Label("I/Y(Interest Rate)");
        intIntrestRatelbl4.setLayoutX(700);
        intIntrestRatelbl4.setLayoutY(100);
        intIntrestRatelbl4.setStyle(hightlight);
        Label intPeriodiclbl5 =       new Label("PMT (Periodic Paymrnt)");
        intPeriodiclbl5.setLayoutX(700);
        intPeriodiclbl5.setLayoutY(200);
        intPeriodiclbl5.setStyle(fieldlbl);
        Label intStarinveslbl6 =      new Label("Starting Investment");
        intStarinveslbl6.setLayoutX(700);
        intStarinveslbl6.setLayoutY(250);
        intStarinveslbl6.setStyle(fieldlbl);
        Label intTolalPrinlbl7 =      new Label("Total Principal");
        intTolalPrinlbl7.setLayoutX(700);
        intTolalPrinlbl7.setLayoutY(300);
        intTolalPrinlbl7.setStyle(fieldlbl);



        // annual payments tab labels
        Label annualPayments_numberofperiods = new Label("Number of Periods");
        annualPayments_numberofperiods.setLayoutX(30);
        annualPayments_numberofperiods.setLayoutY(100);
        annualPayments_numberofperiods.setStyle(fieldlbl);

        Label annualPayments_startPrinciple= new Label("Start Principal");
        annualPayments_startPrinciple.setLayoutX(30);
        annualPayments_startPrinciple.setLayoutY(150);
        annualPayments_startPrinciple.setStyle(fieldlbl);

        Label annualPayments_intrestRate= new Label("Intrest Rate");
        annualPayments_intrestRate.setLayoutX(30);
        annualPayments_intrestRate.setLayoutY(200);
        annualPayments_intrestRate.setStyle(fieldlbl);
        Label annualPayments_futureValue = new Label ("Future Value");
        annualPayments_futureValue.setLayoutX(30);
        annualPayments_futureValue.setLayoutY(250);
        annualPayments_futureValue.setStyle(fieldlbl);

        //annual Payment output results

        Label annuResultlbl0 = new Label("  Result  ");
        annuResultlbl0 .setLayoutX(700);
        annuResultlbl0 .setLayoutY(50);
        annuResultlbl0.setStyle(fieldlbl);
        Label annuFuturelbl1 =         new Label("FV(Future Value)");
        annuFuturelbl1.setLayoutX(700);
        annuFuturelbl1.setLayoutY(300);
        annuFuturelbl1.setStyle(fieldlbl);
        Label annuPresentvaluelbl2=    new Label("PV(Present Value)");
        annuPresentvaluelbl2.setLayoutX(700);
        annuPresentvaluelbl2.setLayoutY(150);
        annuPresentvaluelbl2.setStyle(fieldlbl);
        Label  annuNumberPeriodslbl3=  new Label ("N(Number)");
        annuNumberPeriodslbl3.setLayoutX(700);
        annuNumberPeriodslbl3.setLayoutY(200);
        annuNumberPeriodslbl3.setStyle(fieldlbl);
        Label annuIntrestRatelbl4 =    new Label("I/Y(Interest Rate)");
        annuIntrestRatelbl4.setLayoutX(700);
        annuIntrestRatelbl4.setLayoutY(250);
        annuIntrestRatelbl4.setStyle(fieldlbl);
        Label annuPeriodiclbl5 =       new Label("PMT (Periodic Payment)");
        annuPeriodiclbl5.setLayoutX(700);
        annuPeriodiclbl5.setLayoutY(100);
        annuPeriodiclbl5.setStyle(fieldlbl);
        annuPeriodiclbl5.setStyle(hightlight);
        Label annuStarinveslbl6 =      new Label("Starting Investment");
        annuStarinveslbl6.setLayoutX(700);
        annuStarinveslbl6.setLayoutY(350);
        annuStarinveslbl6.setStyle(fieldlbl);


        //starting principal tab labels
        Label startPrin_intrestRate= new Label("Intrest Rate");
        startPrin_intrestRate.setLayoutX(30);
        startPrin_intrestRate.setLayoutY(100);
        startPrin_intrestRate.setStyle(fieldlbl);

        Label startPrin_numberofperiods = new Label("Number of Periods");
        startPrin_numberofperiods.setLayoutX(30);
        startPrin_numberofperiods.setLayoutY(150);
        startPrin_numberofperiods.setStyle(fieldlbl);

        Label startPrin_annualpayments= new Label("Annual Payments");
        startPrin_annualpayments.setLayoutX(30);
        startPrin_annualpayments.setLayoutY(200);
        startPrin_annualpayments.setStyle(fieldlbl);

        Label startPrin_futureValue = new Label ("Future Value");
        startPrin_futureValue.setLayoutX(30);
        startPrin_futureValue.setLayoutY(250);
        startPrin_futureValue.setStyle(fieldlbl);

        // out put label starting principal
        Label stResultlbl0 = new Label("  Result  ");
        stResultlbl0 .setLayoutX(700);
        stResultlbl0 .setLayoutY(50);
        stResultlbl0.setStyle(fieldlbl);

        Label stFuturelbl1 =         new Label("FV(Future Value)");
        stFuturelbl1.setLayoutX(700);
        stFuturelbl1.setLayoutY(150);
        stFuturelbl1.setStyle(fieldlbl);

        Label  stNumberPeriodslbl3=  new Label ("N(Number)");
        stNumberPeriodslbl3.setLayoutX(700);
        stNumberPeriodslbl3.setLayoutY(200);
        stNumberPeriodslbl3.setStyle(fieldlbl);
        Label stIntrestRatelbl4 =    new Label("I/Y(Interest Rate)");
        stIntrestRatelbl4.setLayoutX(700);
        stIntrestRatelbl4.setLayoutY(250);
        stIntrestRatelbl4.setStyle(fieldlbl);
        Label stPeriodiclbl5 =       new Label("PMT (Periodic Payment)");
        stPeriodiclbl5.setLayoutX(700);
        stPeriodiclbl5.setLayoutY(300);
        stPeriodiclbl5.setStyle(fieldlbl);
        Label stStarinveslbl6 =      new Label("Starting Investment");
        stStarinveslbl6.setLayoutX(700);
        stStarinveslbl6.setLayoutY(100);
        stStarinveslbl6.setStyle(hightlight);


// loan tab labels
        //monthly pay labels
        Label monthlyPay_monthlyPayment= new Label("Monthly Payment");
        monthlyPay_monthlyPayment.setLayoutX(30);
        monthlyPay_monthlyPayment.setLayoutY(100);
        monthlyPay_monthlyPayment.setStyle(fieldlbl);;
        Label monthlyPay_loanTerms = new Label("Loan Terms");
        monthlyPay_loanTerms.setLayoutX(30);
        monthlyPay_loanTerms.setLayoutY(150);
        monthlyPay_loanTerms.setStyle(fieldlbl);
        Label monthlyPay_interestRate= new Label("Intrest Rate");
        monthlyPay_interestRate.setLayoutX(30);
        monthlyPay_interestRate.setLayoutY(200);
        monthlyPay_interestRate.setStyle(fieldlbl);

        Label monthlyPay_downPayment = new Label ("Down Payment");
        monthlyPay_downPayment.setLayoutX(30);
        monthlyPay_downPayment.setLayoutY(250);
        monthlyPay_downPayment.setStyle(fieldlbl);

        Label monthlyPay_saleTax = new Label ("Sales Tax");
        monthlyPay_saleTax.setLayoutX(30);
        monthlyPay_saleTax.setLayoutY(300);
        monthlyPay_saleTax.setStyle(fieldlbl);

        // monthly out put result
        Label monthoutlbl1 =         new Label("Vehical Price");
        monthoutlbl1 .setLayoutX(700);
        monthoutlbl1 .setLayoutY(100);
        monthoutlbl1.setStyle(hightlight);
        Label monthoutlbl2 =    new Label("Total Amount");
        monthoutlbl2 .setLayoutX(700);
        monthoutlbl2 .setLayoutY(150);
        monthoutlbl2.setStyle(fieldlbl);;
        Label  monthoutlbl3 =  new Label ("Sales Tax");
        monthoutlbl3 .setLayoutX(700);
        monthoutlbl3 .setLayoutY(200);
        monthoutlbl3.setStyle(fieldlbl);
        Label monthoutlbl4 =    new Label("Upfront Payment");
        monthoutlbl4 .setLayoutX(700);
        monthoutlbl4.setLayoutY(250);
        monthoutlbl4.setStyle(fieldlbl);
        Label monthoutlbl5  =       new Label("Total of loan payment");
        monthoutlbl5 .setLayoutX(700);
        monthoutlbl5 .setLayoutY(300);
        monthoutlbl5.setStyle(fieldlbl);
        Label monthoutlbl6  =      new Label("Total Loan Interest");
        monthoutlbl6 .setLayoutX(700);
        monthoutlbl6 .setLayoutY(350);
        monthoutlbl6.setStyle(fieldlbl);
        Label monthoutlbl7 =      new Label("Total Cost(Price,intrest,tax,fees)");
        monthoutlbl7 .setLayoutX(700);
        monthoutlbl7 .setLayoutY(400);
        monthoutlbl7.setStyle(fieldlbl);



        // auto loan labels
        Label autoloan_autoPrice= new Label("Auto Price");
        autoloan_autoPrice.setLayoutX(30);
        autoloan_autoPrice.setLayoutY(100);
        autoloan_autoPrice.setStyle(fieldlbl);
        Label autoloan_loanTerms = new Label("Loan Terms");
        autoloan_loanTerms.setLayoutX(30);
        autoloan_loanTerms.setLayoutY(150);
        autoloan_loanTerms.setStyle(fieldlbl);
        Label autoloan_interestRate= new Label("Intrest Rate");
        autoloan_interestRate.setLayoutX(30);
        autoloan_interestRate.setLayoutY(200);
        autoloan_interestRate.setStyle(fieldlbl);

        Label autoloan_downPayment = new Label ("Down Payment");
        autoloan_downPayment.setLayoutX(30);
        autoloan_downPayment.setLayoutY(250);
        autoloan_downPayment.setStyle(fieldlbl);

        Label autoloan_saleTax = new Label ("Sales Tax");
        autoloan_saleTax.setLayoutX(30);
        autoloan_saleTax.setLayoutY(300);
        autoloan_saleTax.setStyle(fieldlbl);
//auto loan result output labels

        Label autooutlbl1 =         new Label("Monthly pay");
        autooutlbl1.setLayoutX(700);
        autooutlbl1.setLayoutY(100);
        autooutlbl1.setStyle(hightlight);
        Label autooutlbl2=    new Label("Total Amount");
        autooutlbl2.setLayoutX(700);
        autooutlbl2.setLayoutY(150);
        autooutlbl2.setStyle(fieldlbl);
        Label  autooutlbl3=  new Label ("Sales Tax");
        autooutlbl3.setLayoutX(700);
        autooutlbl3.setLayoutY(200);
        autooutlbl3.setStyle(fieldlbl);
        Label autooutlbl4=    new Label("Upfront Payment");
        autooutlbl4.setLayoutX(700);
        autooutlbl4.setLayoutY(250);
        autooutlbl4.setStyle(fieldlbl);
        Label autooutlbl5 =       new Label("Total of loan payment");
        autooutlbl5.setLayoutX(700);
        autooutlbl5.setLayoutY(300);
        autooutlbl5.setStyle(fieldlbl);
        Label autooutlbl6 =      new Label("Total Loan Interest");
        autooutlbl6.setLayoutX(700);
        autooutlbl6.setLayoutY(350);
        autooutlbl6.setStyle(fieldlbl);
        Label autooutlbl7 =      new Label("Total Cost(Price,intrest,tax,fees)");
        autooutlbl7.setLayoutX(700);
        autooutlbl7.setLayoutY(400);
        autooutlbl7.setStyle(fieldlbl);




        //panes
        Pane root = new Pane ();
        Pane mortgage = new Pane();
        Pane loans = new Pane();
        Pane finance = new Pane();
        Pane compoundInt = new Pane();
        compoundInt.setStyle("-fx-background-color: white;");
        Pane keyboard =new Pane();
        keyboard.setStyle("-fx-background-color:#36393f;");
        mortgage.setStyle("-fx-background-color:#36393f;");
        compoundInt.setStyle("-fx-background-color:#36393f;");






// Instructions
        Label top_hel = new Label("INSTRUCTIONS ");
        top_hel.setLayoutX(250);
        top_hel.setLayoutX(10);




        //finance tab sub tabs panes
        Pane futureValuePane = new Pane();
        futureValuePane.setStyle("-fx-background-color:#36393f;");

        Pane perioicPaymentPane = new Pane();
        perioicPaymentPane.setStyle("-fx-background-color:#36393f;");

        Pane interestRatePane = new Pane ();
        interestRatePane.setStyle("-fx-background-color:#36393f;");
        Pane annualPaymentPane = new Pane();
        annualPaymentPane.setStyle("-fx-background-color:#36393f;");

        Pane startingPrincipalPane = new Pane ();
        startingPrincipalPane.setStyle("-fx-background-color:#36393f;");

        // loan sub tab panes

        Pane monthlypayPane = new Pane();
        monthlypayPane.setStyle("-fx-background-color:#36393f;");
        Pane autoloanPane = new Pane ();
        autoloanPane.setStyle("-fx-background-color:#36393f;");



        //CREATING TAB PANE
        TabPane calculator= new TabPane();



        //Finance tab pane
        TabPane subfinanceTab = new TabPane();

        TabPane subloanTab = new TabPane();


        //creating tabs to loan
        Tab monthlayPayTab = new Tab ("Monthly Pay");
        Tab autoLoanTab = new  Tab ("Total Price");

        monthlayPayTab.setClosable(false);
        autoLoanTab.setClosable(false);
        subloanTab.getTabs().addAll(monthlayPayTab,autoLoanTab);


        //creating tabs for finance Tab
        Tab futureValueTab  = new Tab ("Future Value ");
        Tab periodicPaymentTab = new Tab ("Number of Periods ");
        Tab interestRateTab  = new Tab ("Interest Rate ");
        Tab numberofPeriodsTab  = new Tab ("Annual Payment ");
        Tab startingPrincipalTab  = new Tab ("Starting Principle ");


        //finance tab closable(false)
        futureValueTab.setClosable(false);
        periodicPaymentTab.setClosable(false);
        interestRateTab.setClosable(false);
        numberofPeriodsTab.setClosable(false);
        startingPrincipalTab.setClosable(false);

        // connecting pane to subtab loan sub Pane
        monthlayPayTab.setContent(monthlypayPane);
        autoLoanTab.setContent(autoloanPane);
        //connecting finance pane to sub finance sub tabs

        futureValueTab.setContent(futureValuePane);
        periodicPaymentTab.setContent(perioicPaymentPane);
        interestRateTab.setContent(interestRatePane);
        numberofPeriodsTab.setContent(annualPaymentPane);
        startingPrincipalTab.setContent(startingPrincipalPane);

        //adding tabs to finance tab
        subfinanceTab.getTabs().addAll(futureValueTab,periodicPaymentTab,interestRateTab,numberofPeriodsTab,startingPrincipalTab);



        // creating Tabs for  Main Calculators

        // tab icons-----------------
        Image mortIcon = new Image(getClass().getResourceAsStream("mort.png"));
        ImageView mortIconView = new ImageView(mortIcon);
        mortIconView.setFitHeight(35);
        mortIconView.setFitWidth(35);

        Image finIcon = new Image(getClass().getResourceAsStream("finance.png"));
        ImageView finIconView = new ImageView(finIcon);
        finIconView.setFitHeight(35);
        finIconView.setFitWidth(35);

        Image loanIcon = new Image(getClass().getResourceAsStream("loan.png"));
        ImageView loanIconView = new ImageView(loanIcon);
        loanIconView.setFitHeight(35);
        loanIconView.setFitWidth(35);


        Image comIcon = new Image(getClass().getResourceAsStream("compo.png"));
        ImageView comIconView = new ImageView(comIcon);
        comIconView.setFitHeight(35);
        comIconView.setFitWidth(35);




        Tab finance_tab =new Tab("Finance");
        finance_tab.setGraphic(finIconView);


        Tab mortgage_tab =new Tab ("Mortgage");
        mortgage_tab.setGraphic(mortIconView);
        Tab loan_tab =new Tab("Loan");
        loan_tab.setGraphic(loanIconView);
        Tab compoundint_tab = new Tab("Simple savings");
        compoundint_tab.setGraphic(comIconView);



        root.getChildren().addAll(calculator,keyboard);



        // adding tabs to  main  calculator tab pane
        calculator.getTabs().addAll(mortgage_tab,finance_tab,loan_tab,compoundint_tab);


        mortgage_tab.setClosable(false);
        loan_tab.setClosable(false);
        finance_tab.setClosable(false);
        compoundint_tab.setClosable(false);

        calculator.setTabMinWidth(250);
        calculator.setTabMinHeight(33);
// main tab tab contant
        mortgage_tab.setContent(mortgage);
        finance_tab.setContent(finance);
        loan_tab.setContent(loans);
        compoundint_tab.setContent(compoundInt);



//key board buttons

        // icons---------------------------------------
        Image homeIcon = new Image(getClass().getResourceAsStream("home.png"));
        ImageView homeIconView = new ImageView(homeIcon);
        homeIconView.setFitHeight(20);
        homeIconView.setFitWidth(20);

        Image closeIcon = new Image(getClass().getResourceAsStream("close.png"));
        ImageView closeIconView = new ImageView(closeIcon);
        closeIconView.setFitHeight(20);
        closeIconView.setFitWidth(20);

        Image goIcon = new Image(getClass().getResourceAsStream("go.png"));
        ImageView goIconView = new ImageView(goIcon);
        goIconView.setFitHeight(45);
        goIconView.setFitWidth(60);




        // STYLES----

        Button num7 =new Button("7");
        num7.setTextFill(Paint.valueOf("ffffff"));
        num7.setStyle("-fx-background-color: #333333; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 20,0; ");


        num7.setLayoutX(650);
        num7.setLayoutY(250);
        num7.setMinSize(100,30);
        num7.setOnAction(event -> keyboardArry[0].setText(keyboardArry[0].getText()+"7"));


        Button num8 =new Button("8");
        num8.setTextFill(Paint.valueOf("ffffff"));
        num8.setStyle("-fx-background-color: #333333; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 20,0; ");

        num8.setLayoutX(775);
        num8.setLayoutY(250);
        num8.setMinSize(100,30);
        num8.setOnAction(event -> keyboardArry[0].setText(keyboardArry[0].getText()+"8"));




        Button num9 =new Button("9");
        num9.setTextFill(Paint.valueOf("ffffff"));
        num9.setStyle("-fx-background-color: #333333; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 20,0; ");

        num9.setLayoutX(900);
        num9.setLayoutY(250);
        num9.setMinSize(100,30);
        num9.setOnAction(event -> keyboardArry[0].setText(keyboardArry[0].getText()+"9"));




        Button num4 =new Button("4");
        num4.setTextFill(Paint.valueOf("ffffff"));
        num4.setStyle("-fx-background-color: #333333; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 20,0; ");

        num4.setLayoutX(650);
        num4.setLayoutY(300);
        num4.setMinSize(100,30);
        num4.setOnAction(event -> keyboardArry[0].setText(keyboardArry[0].getText()+"4"));



        Button num5 =new Button("5");
        num5.setTextFill(Paint.valueOf("ffffff"));
        num5.setStyle("-fx-background-color: #333333; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 20,0; ");

        num5.setLayoutX(775);
        num5.setLayoutY(300);
        num5.setMinSize(100,30);
        num5.setOnAction(event -> keyboardArry[0].setText(keyboardArry[0].getText()+"5"));




        Button num6 =new Button("6");
        num6.setTextFill(Paint.valueOf("ffffff"));
        num6.setStyle("-fx-background-color: #333333; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 20,0; ");

        num6.setLayoutX(900);
        num6.setLayoutY(300);
        num6.setMinSize(100,30);
        num6.setOnAction(event -> keyboardArry[0].setText(keyboardArry[0].getText()+"6"));




        Button num1 =new Button("1");
        num1.setTextFill(Paint.valueOf("ffffff"));
        num1.setStyle("-fx-background-color: #333333; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 20,0; ");

        num1.setLayoutX(650);
        num1.setLayoutY(350);
        num1.setMinSize(100,30);
        num1.setOnAction(event -> keyboardArry[0].setText(keyboardArry[0].getText()+"1"));




        Button num2 =new Button("2");
        num2.setTextFill(Paint.valueOf("ffffff"));
        num2.setStyle("-fx-background-color: #333333; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 20,0; ");

        num2.setLayoutX(775);
        num2.setLayoutY(350);
        num2.setMinSize(100,30);
        num2.setOnAction(event -> keyboardArry[0].setText(keyboardArry[0].getText()+"2"));




        Button num3 =new Button("3");
        num3.setTextFill(Paint.valueOf("ffffff"));
        num3.setStyle("-fx-background-color: #333333; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 20,0; ");

        num3.setLayoutX(900);
        num3.setLayoutY(350);
        num3.setMinSize(100,30);
        num3.setOnAction(event -> keyboardArry[0].setText(keyboardArry[0].getText()+"3"));





        Button point =new Button(".");
        point.setTextFill(Paint.valueOf("ffffff"));
        point.setStyle("-fx-background-color: #fe9505; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 20,0; ");

        point.setLayoutX(650);
        point.setLayoutY(400);
        point.setMinSize(100,40);
        point.setOnAction(event -> keyboardArry[0].setText(keyboardArry[0].getText() +"."));




        Button num0 =new Button("0");
        num0.setTextFill(Paint.valueOf("ffffff"));
        num0.setStyle("-fx-background-color: #333333; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 20,0; ");
        num0.setLayoutX(775);
        num0.setLayoutY(400);
        num0.setMinSize(100,40);
        num0.setOnAction(event -> keyboardArry[0].setText(keyboardArry[0].getText()+"0"));




        Button clear =new Button("⌫");
        clear.setTextFill(Paint.valueOf("ffffff"));
        clear.setStyle("-fx-background-color: #fe9505; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 20,0; ");

        clear.setLayoutX(900);
        clear.setLayoutY(400);
        clear.setMinSize(50,40);
        clear.setOnAction(event -> keyboardArry[0].setText(keyboardArry[0].getText().substring(0,keyboardArry[0].getText().length()-1)));


        Button min =new Button("-");
        min.setTextFill(Paint.valueOf("ffffff"));
        min.setStyle("-fx-background-color: #333333; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 20,0; ");
        min.setLayoutX(950);
        min.setLayoutY(400);
        min.setMinSize(50,40);
        min.setOnAction(event -> keyboardArry[0].setText(keyboardArry[0].getText()+"-"));



        // help button---------------------------------------
        help_button.setTextFill(Paint.valueOf("ffffff"));
        help_button.setStyle("-fx-background-color: #fe9505; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 20,0; ");

        help_button.setLayoutX(1200);
        help_button.setLayoutY(300);
        help_button.setMinSize(120,50);



        Button btnSw2 = new Button(" HOME");
        btnSw2.setTextFill(Paint.valueOf("ffffff"));
        btnSw2.setStyle("-fx-background-color: #fe9505; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 20,0; ");
        btnSw2.setMinSize(120,50);
        btnSw2.setLayoutX(1200);
        btnSw2.setLayoutY(200);
        btnSw2.setOnAction(e -> SwitchScenes1() );

        Button btnClose = new Button("Close");
        btnClose.setMinSize(120,50);
        btnClose.setTextFill(Paint.valueOf("ffffff"));
        btnClose.setStyle("-fx-background-color: #333333; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 20,0; ");

        btnClose.setOnAction(e -> CloseWindowClick());
        btnClose.setLayoutX(1200);
        btnClose.setLayoutY(400);




        // Lets go button---------------------------

        //get start----------------------------------------

        Button btnSw1 = new Button();

        btnSw1.setOnAction(e -> SwitchScenes2() );
        btnSw1.setTextFill(Paint.valueOf("ffffff"));
        btnSw1.setStyle("-fx-background-color: #fe9505; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 50,0; ");
        btnSw1.setLayoutY(600);
        btnSw1.setLayoutX(700);
        btnSw1.setGraphic(goIconView);

        btnSw1.setMinSize(150,80);







//------------------adding button and text fields-----------------------------------------------


// pane content
// adding  lables and text feild to mortgage pane

        mortgage.getChildren().addAll(morttextF_1,morttextF_2,morttextF_3,morttextF_4,mort_calculate,mort_clear);
        mortgage.getChildren().addAll(top_mor,home_price,down_payment,loan_term,interest_rate,MortmonthlyPaylbl1,MorthousePricelbl2,MortloanAmoulbl3,MortdownPaymentlbl4,MortTotalmortaggepaymentlbl5,MorttotalIntrestlbl6);
//finance tab
// adding lables and text field to  Future value Pane
        futureValuePane.getChildren().addAll(fV_textF_1,fV_textF_2,fV_textF_3,fV_textF_4,fv_calculateB,fv_clearB);
        futureValuePane.getChildren().addAll(fv_Noofperiads,fv_StartPrincipal,fv_interestRate,fv_annuityPayment,fvFuturelbl1,fvPresentvaluelbl2,fvNumberPeriodslbl3,fvIntrestRatelbl4,fvPeriodiclbl5,fvStarinveslbl6,fvTolalPrinlbl7,fvResultlbl0);

        // adding lables and text field to periodic payment Pane
        perioicPaymentPane.getChildren().addAll(PeriodPay_futureValue,PeriodPay_startPrinciple,PeriodPay_numberofperiods,PeriodPay_interestRate);
        perioicPaymentPane.getChildren().addAll(PeriodPay_textF_1,PeriodPay_textF_2,PeriodPay_textF_3,PeriodPay_textF_4,Periodic_calculateB,Periodic_clearB);
        perioicPaymentPane.getChildren().addAll(PreResultlbl0,PreFuturelbl1,PrePresentvaluelbl2,PreNumberPeriodslbl3,PreIntrestRatelbl4,PrePeriodiclbl5,PreStarinveslbl6,PreTolalPrinlbl7,PreTolalIntlbl8);
        // adding lables and text field to intrest rate pane
        interestRatePane.getChildren().addAll(intrestRate_numberofperiods,intrestRate_startPrinciple,intrestRate_annnualpayments,intrestRate_futureValue);
        interestRatePane.getChildren().addAll(intrestRate_textF_1,intrestRate_textF_2,intrestRate_textF_3,intrestRate_textF_4,Intrest_calculateB,Intrest_clearB);

        interestRatePane.getChildren().addAll(intResultlbl0,intNumberPeriodslbl3,intIntrestRatelbl4,intPeriodiclbl5,intStarinveslbl6,intTolalPrinlbl7);


//        //addding lables and text field to  annual payment pane
        annualPaymentPane.getChildren().addAll(annualPayment_textF_1,annualPayment_textF_2,annualPayment_textF_3,annualPayment_textF_4,annualpay_calculateB,annualpay_clearB);
        annualPaymentPane.getChildren().addAll(annualPayments_numberofperiods,annualPayments_startPrinciple,annualPayments_intrestRate,annualPayments_futureValue);
        annualPaymentPane.getChildren().addAll(annuResultlbl0,annuFuturelbl1,annuPresentvaluelbl2,annuNumberPeriodslbl3,annuIntrestRatelbl4,annuPeriodiclbl5,annuStarinveslbl6);
//adding  lables and text field to starting principal
        startingPrincipalPane.getChildren().addAll(startingPrincipal_textF_1,startingPrincipal_textF_2,startingPrincipal_textF_3,startingPrincipal_textF_4,StartingPrin_calculateB,StartingPrin_clearB);
        startingPrincipalPane.getChildren().addAll(startPrin_intrestRate,startPrin_numberofperiods,startPrin_annualpayments,startPrin_futureValue);
        startingPrincipalPane.getChildren().addAll(stResultlbl0,stFuturelbl1,stNumberPeriodslbl3,stIntrestRatelbl4,stPeriodiclbl5,stStarinveslbl6);
        //loan tab

        // adding lables and text field to monthly pay
        monthlypayPane.getChildren().addAll(mothlyPay_textF_1,mothlyPay_textF_2,mothlyPay_textF_3,mothlyPay_textF_4,mothlyPay_textF_5,monthlypay_calculateB,monthlypay_clearB);
        monthlypayPane.getChildren().addAll(monthlyPay_monthlyPayment,monthlyPay_loanTerms,monthlyPay_interestRate,monthlyPay_downPayment,monthlyPay_saleTax);
        monthlypayPane.getChildren().addAll(monthoutlbl1,monthoutlbl2,monthoutlbl3,monthoutlbl4,monthoutlbl5,monthoutlbl6,monthoutlbl7);
        // adding lables and text field to auto loan
        autoloanPane.getChildren().addAll(autoloan_textF_1,autoloan_textF_2,autoloan_textF_3,autoloan_textF_4,autoloan_textF_5,autoLoan_clearB,autoLoan_calculateB);
        autoloanPane.getChildren().addAll(autoloan_autoPrice,autoloan_loanTerms,autoloan_interestRate,autoloan_downPayment,autoloan_saleTax);
        autoloanPane.getChildren().addAll(autooutlbl1,autooutlbl2,autooutlbl3,autooutlbl4,autooutlbl5,autooutlbl6,autooutlbl7);
// compound intrest
        compoundInt.getChildren().addAll(comp_years,comp_Principal,comp_annual,comp_interest,comp_calculate,comp_clear,compoint_textF_1,compoint_textF_2,compoint_textF_3);
        compoundInt.getChildren().addAll(complbl1,complbl2,complbl3,compoint_textF_4);

//  adding buttons keyboard
        keyboard.getChildren().addAll(num0,num1,num2,num3,num4,num5,num6,num7,num8,num9,clear,point,help_button,btnClose,btnSw2,min);
// adding headdings to tabs

        mortgage_tab.setContent(mortgage);

        //finance tab  sub tabs connecting
        finance_tab.setContent(subfinanceTab);
// loan tab sub tbs connecting
        loan_tab.setContent(subloanTab);


        //help button funtion

//-------------------about app button funtion
        help_button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SwitchScenes3();
            }
        });



        ///-----------------------------------------------------clear button funtion--
        //compound intrest
        comp_clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                compoint_textF_1.clear();
                compoint_textF_2.clear();
                compoint_textF_3.clear();

            }
        });

        //Morgage calculator  clear button funtions
        mort_clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                morttextF_1.clear();
                morttextF_2.clear();
                morttextF_3.clear();
                morttextF_4.clear();
            }
        });



        fv_clearB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fV_textF_1.clear();
                fV_textF_2.clear();
                fV_textF_3.clear();
                fV_textF_4.clear();


            }
        });
        Periodic_clearB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PeriodPay_textF_1.clear();
                PeriodPay_textF_2.clear();
                PeriodPay_textF_3.clear();
                PeriodPay_textF_4.clear();


            }
        });
        Intrest_clearB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                intrestRate_textF_1.clear();
                intrestRate_textF_2.clear();
                intrestRate_textF_3.clear();
                intrestRate_textF_4.clear();


            }
        });
        annualpay_clearB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                annualPayment_textF_1.clear();
                annualPayment_textF_2.clear();
                annualPayment_textF_3.clear();
                annualPayment_textF_4.clear();
            }
        });
        StartingPrin_clearB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                startingPrincipal_textF_1.clear();
                startingPrincipal_textF_2.clear();
                startingPrincipal_textF_3.clear();
                startingPrincipal_textF_4.clear();

            }
        });
        monthlypay_clearB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mothlyPay_textF_1.clear();
                mothlyPay_textF_2.clear();
                mothlyPay_textF_3.clear();
                mothlyPay_textF_4.clear();
                mothlyPay_textF_5.clear();

            }
        });

        autoLoan_clearB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                autoloan_textF_1.clear();
                autoloan_textF_2.clear();
                autoloan_textF_3.clear();
                autoloan_textF_4.clear();
                autoloan_textF_5.clear();

            }
        });


        //compound intrest calculate funtion

        comp_calculate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                Double p = Double.parseDouble(compoint_textF_1.getText());
                Double contri= Double.parseDouble(compoint_textF_2.getText());
                Double interest = Double.parseDouble(compoint_textF_3.getText());
                Double n = Double.parseDouble(compoint_textF_4.getText());
                double r=interest/100;
                double A = Math.round(p * (Math.pow((1 + (r / n)),(n)))/100.00)*100.0;
                double totalPrin = Math.round(((contri*n)+p)/100.00)*100.0;
                double End = A+totalPrin;
                File file =new File("text.txt");
                file.createNewFile();
                FileWriter fW = new FileWriter(file,true);
                BufferedWriter  bw= new BufferedWriter(fW);




                bw.write("compound intrest "+java.time.LocalDateTime.now());
                bw.write(String.valueOf(End)+"\n");
                bw.write(String.valueOf(totalPrin)+"\n");
                bw.write(String.valueOf(A)+"\n");
               ;
                bw.write("------------------------------------");

                bw.close();

                complbl1.setText("End Balance-------------------- $ "+End);
                complbl2.setText("Total Principal-------------------- $ "+totalPrin);
                complbl3.setText("Total Intrest-------------------- $ "+A);

                }catch (NumberFormatException | IOException e){
                    Alert aboutApp = new Alert(Alert.AlertType.INFORMATION);

                    aboutApp.setTitle("Error");

                    aboutApp.setHeaderText("Messege");
                    aboutApp.setContentText("something is missing or invalid value ");

                    aboutApp.showAndWait();
                    return ;


                }
                return ;
            }
        });;

        //auto loan calculator funtion
        autoLoan_calculateB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                try {
                    Double autoprice = Double.parseDouble(autoloan_textF_1.getText());
                    Double loanTerms = Double.parseDouble(autoloan_textF_2.getText());
                    Double intrestRate = Double.parseDouble(autoloan_textF_3.getText());
                    Double downPayment = Double.parseDouble(autoloan_textF_4.getText());
                    Double salesTax = Double.parseDouble(autoloan_textF_5.getText());

                    double strtingloanblance = autoprice-downPayment;

                    double r = intrestRate / 100;
                    double paysalestax = Math.round(((salesTax/100)*autoprice)*100.00)/100.00;
                    double x = Math.pow((1 + r), loanTerms);
                    double upper = strtingloanblance * r * x;

                    double lower = x - 1;
                    double pmt = Math.round((upper / lower) * 100.00) / 100.00;
                    double upperfornt = downPayment+paysalestax;
                    double totatInt =Math.round( ((pmt*loanTerms)-strtingloanblance)*100.00)/100.00;


                    double finalpayment = strtingloanblance+totatInt;
                    double finalCost = finalpayment+paysalestax;
                    File file =new File("text.txt");
                    file.createNewFile();
                    FileWriter fW = new FileWriter(file,true);
                    BufferedWriter  bw= new BufferedWriter(fW);




                    bw.write("Auto loan  "+java.time.LocalDateTime.now());
                    bw.write(String.valueOf(pmt)+"\n");
                    bw.write(String.valueOf(strtingloanblance)+"\n");
                    bw.write(String.valueOf(paysalestax)+"\n");
                    bw.write(String.valueOf(upperfornt)+"\n");
                    bw.write(String.valueOf(finalpayment)+"\n\n");
                    bw.write(String.valueOf(totatInt)+"\n");
                    bw.write(String.valueOf(finalCost)+"\n\n");
                    bw.write("------------------------------------");

                    bw.close();




// set output of autoloan

                    autooutlbl1.setText("Monthly pay----------------------- $ " + pmt);
                    autooutlbl2.setText("Total Amount---------------------- $ "+strtingloanblance);
                    autooutlbl3.setText("Sales Tax------------------------- $ "+paysalestax);
                    autooutlbl4.setText("Upfront Payment------------------- $ "+upperfornt);
                    autooutlbl5.setText("Total of "+ autoloan_textF_2.getText() +" loan payment------------$ "+finalpayment);
                    autooutlbl6.setText("Total Loan Interest----------------$ "+totatInt);
                    autooutlbl7.setText("Total Cost(Price,intrest,tax,fees)- $ "+finalCost);

                }catch (NumberFormatException | IOException e){
                    Alert aboutApp = new Alert(Alert.AlertType.INFORMATION);

                    aboutApp.setTitle("Error");

                    aboutApp.setHeaderText("Messege");
                    aboutApp.setContentText("something is missing or invalid value ");

                    aboutApp.showAndWait();
                    return ;


                }
                return ;
            }
        });
        //loan monthly payment funtion
        monthlypay_calculateB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Double Pmt = Double.parseDouble(mothlyPay_textF_1.getText());
                    Double t = Double.parseDouble(mothlyPay_textF_2.getText());
                    Double intrest = Double.parseDouble(mothlyPay_textF_3.getText());
                    Double moDownPayment = Double.parseDouble(mothlyPay_textF_4.getText());
                    Double mosalesTax =Double.parseDouble(mothlyPay_textF_5.getText());

                    double r = intrest/1200;
                    double x = Math.pow((1 + r), t);
                    double upper = Pmt*(x-1);
                    double down = r*x;
                    double p = upper/down;
                    double tax = Math.round((mosalesTax*p/100)*100.00)/100.00;






                    double autoPrice =Math.round((p+moDownPayment)*100.00)/100.00;
                    double totalLoanAmount = Math.round(p*100.00)/100.00;

                    double upfont = Math.round((tax+moDownPayment)*100.00)/100.00;
                    double totalloanpay = t*Pmt;
                    double totalint = Math.round((totalloanpay-totalLoanAmount)*100.00)/100.00;
                    double totalCost = Math.round((totalloanpay+upfont)*100.00)/100.00;

                    File file =new File("text.txt");
                    file.createNewFile();
                    FileWriter fW = new FileWriter(file,true);
                    BufferedWriter  bw= new BufferedWriter(fW);




                    bw.write("Monthly pay "+java.time.LocalDateTime.now());
                    bw.write(String.valueOf(autoPrice)+"\n");
                    bw.write(String.valueOf(totalLoanAmount)+"\n");
                    bw.write(String.valueOf(tax)+"\n");
                    bw.write(String.valueOf(upfont)+"\n");
                    bw.write(String.valueOf(totalloanpay)+"\n\n");
                    bw.write(String.valueOf(totalint)+"\n");
                    bw.write(String.valueOf(totalCost)+"\n\n");
                    bw.write("------------------------------------");

                    bw.close();


                    monthoutlbl1.setText("Vehical Price-------------------------$ "+autoPrice);
                    monthoutlbl2.setText("Total Amount--------------------------$ "+totalLoanAmount);
                    monthoutlbl3.setText("Sales Tax-----------------------------$ "+tax);
                    monthoutlbl4.setText("Upfront Payment-----------------------$ "+upfont);
                    monthoutlbl5.setText("Total "+mothlyPay_textF_2.getText()+" of payment----------------------$ "+totalloanpay);
                    monthoutlbl6.setText("Total Loan Intrest--------------------$ "+totalint);
                    monthoutlbl7.setText("Toatal Cost (Price,Intrest,tax,fees)----$ "+totalCost);

                }catch (NumberFormatException | IOException e){
                    Alert aboutApp = new Alert(Alert.AlertType.INFORMATION);

                    aboutApp.setTitle("Error");

                    aboutApp.setHeaderText("Messege");
                    aboutApp.setContentText("something is missing or invalid value ");

                    aboutApp.showAndWait();
                    return ;


                }
                return ;
            }

        });
//future value cal culator funtion
        fv_calculateB.setOnAction(new EventHandler<ActionEvent>() {
            @Override


            public void handle(ActionEvent event) {

                try {
                    double fv_n = Double.parseDouble(fV_textF_1.getText());
                    Double fv_sp = Double.parseDouble(fV_textF_2.getText());
                    Double fv_rate = Double.parseDouble(fV_textF_3.getText());
                    Double fv_p = Double.parseDouble(fV_textF_4.getText());
                    Double r = fv_rate / 100;


                    double rPluseOne = Math.pow((1 + r), fv_n);
                    double part1 = fv_sp * rPluseOne;
                    double part2 = fv_p * ((rPluseOne - 1) / r);



                    double fv_totalPrin = (fv_n * fv_p) + fv_sp;
                    double end_fv = Math.round((part1 + part2) * 100.00) / 100.00;
                    double fv_pv = Math.round((end_fv / rPluseOne) * 100.00) / 100.00;


                    File file =new File("text.txt");
                    file.createNewFile();
                    FileWriter fW = new FileWriter(file,true);
                    BufferedWriter  bw= new BufferedWriter(fW);




                    bw.write("future value "+java.time.LocalDateTime.now());
                    bw.write(String.valueOf(end_fv)+"\n");
                    bw.write(String.valueOf(fv_pv)+"\n");
                    bw.write(String.valueOf(fv_n)+"\n");
                    bw.write(String.valueOf(fv_rate)+"\n");
                    bw.write(String.valueOf(fv_p)+"\n\n");
                    bw.write(String.valueOf(fv_sp)+"\n");
                    bw.write(String.valueOf(fv_totalPrin)+"\n\n");
                    bw.write("------------------------------------");

                    bw.close();





                    fvFuturelbl1.setText("FV(Future Value)-------------------- $ " + end_fv);
                    fvPresentvaluelbl2.setText("PV(Present Value)------------- $ " + fv_pv);
                    fvNumberPeriodslbl3.setText("N(Number)--------------------   " + fv_n);
                    fvIntrestRatelbl4.setText("I/Y(Interest Rate)-------------   " + fv_rate + " %");
                    fvPeriodiclbl5.setText("PMT (Periodic Payment)------------ $ " + fv_p);
                    fvStarinveslbl6.setText("Starting Investment-------------- $ " + fv_sp);
                    fvTolalPrinlbl7.setText("Total Principal------------------ $ " + fv_totalPrin);

                }catch (NumberFormatException | IOException e){
                    Alert aboutApp = new Alert(Alert.AlertType.INFORMATION);

                    aboutApp.setTitle("Error");

                    aboutApp.setHeaderText("Messege");
                    aboutApp.setContentText("something is missing or invalid value ");

                    aboutApp.showAndWait();
                    return ;


                }
                return ;
            }
        });
//number of period tab calculation  funtion
        Periodic_calculateB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                try {
                Double intrest = Double.parseDouble(PeriodPay_textF_1.getText());
                Double   p = Double.parseDouble(PeriodPay_textF_2.getText());
                Double  pmt = Double.parseDouble(PeriodPay_textF_3.getText());
                Double a = Double.parseDouble(PeriodPay_textF_4.getText());
                Double  r = intrest/100;

                double upper1=(a*r)+pmt;
                double upper2=(p*r)+pmt;
                double upper = Math.log(upper1/upper2);

                double down = Math.log(1+r);
                double peri = Math.round((upper/down)*100.00)/100.00;
                double totprin = Math.round(((peri*pmt)+p)*100.00)/100.00;
                double totalInt =Math.round((a-totprin)*100.00)/100.00;
                File file =new File("text.txt");
                file.createNewFile();
                FileWriter fW = new FileWriter(file,true);
                BufferedWriter  bw= new BufferedWriter(fW);




                bw.write("number of priods "+java.time.LocalDateTime.now());
                bw.write(String.valueOf(a)+"\n");
                bw.write(String.valueOf(peri)+"\n");
                bw.write(String.valueOf(intrest)+"\n");
                bw.write(String.valueOf(pmt)+"\n");
                bw.write(String.valueOf(totprin)+"\n\n");
                bw.write(String.valueOf(totalInt)+"\n\n");
                bw.write("------------------------------------");

                bw.close();


                //set output of periodic payment
                PreFuturelbl1.setText("FV(Future Value)----------------- $ "+ a);
                PreNumberPeriodslbl3.setText("N(Number)--------------- "+peri);
                PreIntrestRatelbl4.setText("I/Y(Interest Rate)------------------ "+intrest+"%");
                PrePeriodiclbl5.setText("PMT(Periodic Payment)------------------- $ "+pmt);
                PreStarinveslbl6.setText("Starting Investment----------------- $ "+ p );
                PreTolalPrinlbl7.setText("Total Principle---------------------- $"+ totprin);
                PreTolalIntlbl8.setText("Total Intrest----------------- $ "+totalInt);
                }catch (NumberFormatException | IOException e){
                    Alert aboutApp = new Alert(Alert.AlertType.INFORMATION);

                    aboutApp.setTitle("Error");

                    aboutApp.setHeaderText("Messege");
                    aboutApp.setContentText("something is missing or invalid value ");

                    aboutApp.showAndWait();
                    return ;


                }
                return ;
            }

        });

        //intrest rate cal culation
        Intrest_calculateB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                try {
                    Double n = Double.parseDouble(intrestRate_textF_1.getText());
                    Double p = Double.parseDouble(intrestRate_textF_2.getText());
                    Double pmt = Double.parseDouble(intrestRate_textF_3.getText());
                    Double a = Double.parseDouble(intrestRate_textF_4.getText());

                    double x = (a / p);
                    double y = Math.pow(x, (1 / n));
                    double z = y - 1;
                    double f = Math.round((z * n) * 100.00);
                    double fv = p * (Math.pow(1 + (f / (100 * n)), n));
                    double tp = Math.round((p + (pmt * n)) / 100.00) * 100.00;
                    File file =new File("text.txt");
                    file.createNewFile();
                    FileWriter fW = new FileWriter(file,true);
                    BufferedWriter  bw= new BufferedWriter(fW);




                    bw.write("Intrest    "+java.time.LocalDateTime.now());
                    bw.write(String.valueOf(n)+"\n");
                    bw.write(String.valueOf(f)+"\n");
                    bw.write(String.valueOf(pmt)+"\n");
                    bw.write(String.valueOf(p)+"\n");
                    bw.write(String.valueOf(tp)+"\n\n");
                    bw.write("------------------------------------");

                    bw.close();


                    intNumberPeriodslbl3.setText("N(Number)--------------- " + n );
                    intIntrestRatelbl4.setText("I/Y(Interest Rate)_____________" + f + "%");
                    intPeriodiclbl5.setText("PMT(Periodic Payment)-------------- $ " + pmt);
                    intStarinveslbl6.setText("Starting Invesment-----------------$ " + p);
                    intTolalPrinlbl7.setText("Total Principal-------------------$ " + tp);
                }catch (NumberFormatException | IOException e){
                    Alert aboutApp = new Alert(Alert.AlertType.INFORMATION);

                    aboutApp.setTitle("Error");

                    aboutApp.setHeaderText("Messege");
                    aboutApp.setContentText("something is missing or invalid value ");

                    aboutApp.showAndWait();
                    return ;


                }
                return ;
            }

        });
        annualpay_calculateB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                    Double n = Double.parseDouble(annualPayment_textF_1.getText());
                    Double p = Double.parseDouble(annualPayment_textF_2.getText());
                    Double intrest = Double.parseDouble(annualPayment_textF_3.getText());
                    Double a = Double.parseDouble(annualPayment_textF_4.getText());

                    double r=intrest/100;

                    double onepl = Math.pow((1+r),n);
                    double part1 = (p*r*onepl)/(onepl-1);
                    double part2 = (a*r)/(onepl-1);
                    double finpmt = Math.round((part1+part2)*100.00)/100.00;

                    File file =new File("text.txt");
                    file.createNewFile();
                    FileWriter fW = new FileWriter(file,true);
                    BufferedWriter  bw= new BufferedWriter(fW);


                    bw.write("Annual Payment   "+java.time.LocalDateTime.now());


                    bw.write(String.valueOf(a)+"\n");
                    bw.write(String.valueOf(intrest)+"\n");
                    bw.write(String.valueOf(n)+"\n");
                    bw.write(String.valueOf(finpmt)+"\n");
                    bw.write(String.valueOf(p)+"\n");
                    bw.write("------------------------------------");
                    bw.close();




                    annuFuturelbl1.setText("FV(Future Value)------------------- $ "+a);
                    annuIntrestRatelbl4.setText("I/Y(Interest Rate)--------------- "+intrest+"%");
                    annuNumberPeriodslbl3.setText("N(Number)----------------------- "+n);
                    annuPeriodiclbl5.setText("PMT(Periodic Payment)--------------- $ "+finpmt);
                    annuStarinveslbl6.setText("Starting Invesment----------------- $ "+p);

                }catch (NumberFormatException | IOException e){
                    Alert aboutApp = new Alert(Alert.AlertType.INFORMATION);

                    aboutApp.setTitle("Error");

                    aboutApp.setHeaderText("Messege");
                    aboutApp.setContentText("something is missing or invalid value ");

                    aboutApp.showAndWait();
                    return ;


                }
                return ;
            }

        });

//starting principal
        StartingPrin_calculateB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                    Double intrest = Double.parseDouble(startingPrincipal_textF_1.getText());
                    Double n  = Double.parseDouble(startingPrincipal_textF_2.getText());
                    Double pmt = Double.parseDouble(startingPrincipal_textF_3.getText());
                    Double a = Double.parseDouble(startingPrincipal_textF_4.getText());
                    double r = intrest/100;
                    double onePl = Math.pow((1+r),n);
                    double part1 = a/onePl;
                    double upper = pmt*(onePl-1);
                    double part2 = upper/(r*onePl);
                    double p = Math.round((part1+part2)*100.00)/100.00;
                    double totalPrin = a+(pmt*10);

                    File file =new File("text.txt");
                    file.createNewFile();
                    FileWriter fW = new FileWriter(file,true);
                    BufferedWriter  bw= new BufferedWriter(fW);


                    bw.write("starting principle   "+java.time.LocalDateTime.now());
                    bw.write(String.valueOf(p)+"\n");
                    bw.write(String.valueOf(a)+"\n");
                    bw.write(String.valueOf(n)+"\n");
                    bw.write(String.valueOf(intrest)+"\n");
                    bw.write(String.valueOf(pmt)+"\n\n");
                    bw.write("------------------------------------");
                    bw.close();

                    stStarinveslbl6.setText("Starting Investment--------------- $ "+p);
                    stFuturelbl1.setText("Future Value ----------------------- $"+a);
                    stNumberPeriodslbl3.setText("N(Number)--------------------- "+ n);
                    stIntrestRatelbl4.setText("I/Y(Intrest Rate)---------------- "+intrest+" %" );
                    stPeriodiclbl5.setText("PMT()Periodic Payment----------------- $ "+pmt);

                }catch (NumberFormatException | IOException e){
                    Alert aboutApp = new Alert(Alert.AlertType.INFORMATION);

                    aboutApp.setTitle("Error");

                    aboutApp.setHeaderText("Messege");
                    aboutApp.setContentText("something is missing or invalid value ");

                    aboutApp.showAndWait();
                    return ;


                }
                return ;
            }

        });




        mort_calculate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


                try{
                    Double mortPrice = Double.parseDouble(morttextF_1.getText());
                    Double mortDownPay = Double.parseDouble(morttextF_2.getText());
                    Double mortTerm = Double.parseDouble(morttextF_3.getText());
                    Double mortInterest = Double.parseDouble(morttextF_4.getText());

                    Double mortA = mortPrice * ((100 - mortDownPay) / 100);
                    Double mortDown =Math.round( (mortPrice - mortA)/100.00)/100.00;

                    Double n = mortTerm * 12;
                    Double r = mortInterest / 1200;
                    Double x = Math.pow((1 + r), n);
                    Double up = mortA * r * x;
                    Double down = x - 1;
                    Double mortFinal = up / down;
                    Double mortMothlyPay = Math.round(mortFinal * 100.00) / 100.00;
                    Double mortmoyhlytot = Math.round(mortFinal * n * 100.00) / 100.00;
                    Double mortTotalint = mortmoyhlytot - mortA;
                    File file =new File("text.txt");
                    file.createNewFile();
                    FileWriter fW = new FileWriter(file,true);
                    BufferedWriter  bw= new BufferedWriter(fW);




                    bw.write("mortgage   "+java.time.LocalDateTime.now());
                    bw.write(String.valueOf(mortMothlyPay)+"\n");
                    bw.write(String.valueOf(mortA)+"\n");
                    bw.write(String.valueOf(mortDown)+"\n");
                    bw.write(String.valueOf(mortmoyhlytot)+"\n");
                    bw.write(String.valueOf(mortTotalint)+"\n\n");
                    bw.write("------------------------------------");

                    bw.close();

// Display output
                    MortmonthlyPaylbl1.setText("Monthly Pay-------------------- $ " + mortMothlyPay);
                    MorthousePricelbl2.setText("House Price-------------------- $ " + mortPrice);
                    MortloanAmoulbl3.setText("Loan Amount-------------------- $ " + mortA);
                    MortdownPaymentlbl4.setText("Down Payment---------------------- $ " + mortDown);
                    MortTotalmortaggepaymentlbl5.setText("Total Mortagage Payment--- $ " + mortmoyhlytot);
                    MorttotalIntrestlbl6.setText("Total interest---------------------- $ " + mortTotalint);


                }catch (NumberFormatException | IOException e){
                    Alert aboutApp = new Alert(Alert.AlertType.INFORMATION);

                    aboutApp.setTitle("Error");

                    aboutApp.setHeaderText("Messege");
                    aboutApp.setContentText("something is missing or invalid value ");

                    aboutApp.showAndWait();
                    return ;


                }
                return ;
            }

        });


        btnSw2.setGraphic(homeIconView);
        btnClose.setGraphic(closeIconView);




        mortgage.setMinSize(1500, 500);
        keyboard.setMinSize(2000,500);
        keyboard.setLayoutX(-450);
        keyboard.setLayoutY(550);

        // help pane content

        Button help_button =new Button("Help");


        help_button.setStyle("-fx-background-color: #333333;-fx-border-color: white; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 50,0; ");
        help_button.setLayoutY(700);
        help_button.setLayoutX(700);
        help_button.setTextFill(Paint.valueOf("ffffff"));


        help_button.setAlignment(Pos.CENTER);
        help_button.setMinSize(150,80);
        help_button.setOnAction(e -> SwitchScenes3() );

        Button help_back =new Button("Back");


        help_back.setStyle("-fx-background-color: #333333;-fx-border-color: white; -fx-border-radius: 30; -fx-padding: 10;-fx-background-radius: 50,0; ");
        help_back.setLayoutY(800);
        help_back.setLayoutX(1200);
        help_back.setTextFill(Paint.valueOf("ffffff"));


        help_back.setAlignment(Pos.CENTER);
        help_back.setMinSize(150,80);
        help_back.setOnAction(e -> SwitchScenes1() );




        help = new Pane();
        hbox1 = new Pane();
        hbox1.getChildren().addAll(btnSw1,help_button);
        help.getChildren().addAll(help_back);


        scene1 = new Scene(hbox1, 1500, 1000);
        scene2 = new Scene(root, 1500, 1000);
        scene3 = new Scene(help,1500,1000);
//adding imagers to oanes

        keyboard.setStyle("-fx-background-color: #333333;-fx-background-image: url('sample/keyboard.jpg')");
        hbox1.setStyle("-fx-background-color: #333333;-fx-background-image: url('sample/cxv.jpg')");
        help.setStyle("-fx-background-image: url('sample/help.jpg')");

        stage = primaryStage;
        stage.setResizable(false);
        stage.setScene(scene1);
        stage.setTitle("Financal Calculator");
        stage.getIcons().add(new Image(Main.class.getResourceAsStream("icon.png")));
         stage.show();

    }

    public void SwitchScenes1(){

        stage.setScene(scene1);
    }
    public void SwitchScenes2(){

        stage.setScene(scene2);
    }
    public void SwitchScenes3(){

        stage.setScene(scene3);
    }
    public void CloseWindowClick(){
        stage.close();
    }

}