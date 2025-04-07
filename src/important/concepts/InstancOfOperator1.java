// ------------------------------------------------------------------------------------------------------------------------------------

package important.concepts;

class Head {
    protected String head;
}

class Txn extends Head{
    protected String txn;
}

class PayerAndPayer extends Txn {
    protected String payer;
    protected String payee;
}

class ReqPay extends PayerAndPayer {
    protected String reqPay;
}

public class InstancOfOperator1 {

    public static void main(String[] args) {

        ReqPay reqPay = new ReqPay();

        // if(reqPay instanceof ReqPay reqPay1) {                  // <---- Always true i.e. Giving Warning, please Ignore
            parseReqPay((ReqPay) reqPay);
        //}

        // if(reqPay instanceof PayerAndPayer payerAndPayer) {     // <---- Always true i.e. Giving Warning, please Ignore
            parsePayerAndPayer((PayerAndPayer) reqPay);
        // }

        // if(reqPay instanceof Txn txn) {                         // <---- Always true i.e. Giving Warning, please Ignore
            parseTxn((Txn) reqPay);
        // }

        // if(reqPay instanceof Head head) {                       // <---- Always true i.e. Giving Warning, please Ignore
            parseHead((Head) reqPay);
        // }
    }

    static void parseReqPay(ReqPay reqPay) {
        reqPay.head = "HEAD";
        reqPay.txn = "TXN";
        reqPay.payer = "PAYER";
        reqPay.payee = "PAYEE";
        reqPay.reqPay = "REQ_PAY";
    }

    static void parsePayerAndPayer(PayerAndPayer payerAndPayer) {
        payerAndPayer.head = "HEAD";
        payerAndPayer.txn = "TXN";
        payerAndPayer.payer = "PAYER";
        payerAndPayer.payee = "PAYEE";
        // payerAndPayer.reqPay = "REQ_PAY";       <------ Cannot resolve symbol 'reqPay'
    }

    static void parseTxn(Txn txn) {
        txn.head = "HEAD";
        txn.txn = "TXN";
        // txn.payer = "PAYER";          <------ Cannot resolve symbol 'payer'
        // txn.payee = "PAYEE";          <------ Cannot resolve symbol 'payee'
        // txn.reqPay = "REQ_PAY";       <------ Cannot resolve symbol 'reqPay'
    }

    static void parseHead(Head head) {
        head.head = "HEAD";
        // head.txn = "TXN";             <------ Cannot resolve symbol 'txn'
        // txn.payer = "PAYER";          <------ Cannot resolve symbol 'payer'
        // txn.payee = "PAYEE";          <------ Cannot resolve symbol 'payee'
        // txn.reqPay = "REQ_PAY";       <------ Cannot resolve symbol 'reqPay'
    }
}

// ------------------------------------------------------------------------------------------------------------------------------------