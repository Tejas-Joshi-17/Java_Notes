// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
 * 'instanceOf' Operator :-
 *         1) The instanceof keyword checks whether an object is an instance of a specific class or an interface.
 *         2) The instanceof keyword compares the instance with type. The return value is either true or false.
 */

// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

package important.concepts;

class Head {
    protected String head;
}

class Txn extends Head{
    protected String txn;
}

class PayerAndPayee extends Txn {
    protected String payer;
    protected String payee;
}

class ReqPay extends PayerAndPayee {
    protected String reqPay;
}

public class InstanceOfOperator1 {

    public static void main(String[] args) {

        ReqPay reqPay = new ReqPay();

        // if(reqPay instanceof ReqPay reqPay1) {                  // <---- Always true i.e. Giving Warning, please Ignore
            parseReqPay((ReqPay) reqPay);
        //}p
        // if(reqPay instanceof PayerAndPayee payerAndPayee) {     // <---- Always true i.e. Giving Warning, please Ignore
            parsePayerAndPayee((PayerAndPayee) reqPay);
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

    static void parsePayerAndPayee(PayerAndPayee payerAndPayee) {
        payerAndPayee.head = "HEAD";
        payerAndPayee.txn = "TXN";
        payerAndPayee.payer = "PAYER";
        payerAndPayee.payee = "PAYEE";
        // payerAndPayee.reqPay = "REQ_PAY";       <------ Cannot resolve symbol 'reqPay'
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

// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------