package EventDayCheck;

public enum PayBonusEvt {

    NEWYEAR_EVT("202001201000000","202001281000000"), //이벤트기간 : 2020-01-20 ~ 2020-01-27
    THANKS_EVT("202001281000000","202002051000000"),  //이벤트기간 : 2020-01-28 ~ 2020-02-05
    TEST_EVT("20200121000000","2020012200000");    //이벤트기간 : 2020-01-21 ~ 2020-01-21

    private String sEvt;    //이벤트시작일
    private String eEvt;    //이벤트종료일

    PayBonusEvt(String sEvt, String eEvt) {
        this.sEvt = sEvt;
        this.eEvt = eEvt;
    }

    public String getsEvt() {
        return this.sEvt;
    }

    public String geteEvt() {
        return this.eEvt;
    }
}
