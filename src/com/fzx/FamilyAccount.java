package com.fzx;

/*
FamilyAccountSystem
 */


/**
 * test stash
 */
public class FamilyAccount {
    public static void main(String[] args) {
        boolean flag = true;
        String details="收支\t\t账户金额\t\t收支金额\t\t说   明\n";
        int balance=10000;


        while (flag) {
            System.out.println("-----------------家庭收支记账软件-----------------\n");
            System.out.println("                    1.收支明细");
            System.out.println("                    2.登记收入");
            System.out.println("                    3.登记支出");
            System.out.println("                    4.退   出\n");
            System.out.print("                    请选择(1-4):");
            char selection = Utility.readMenuSelection();
            switch (selection) {
                case '1':
                    //System.out.println("1.收支明细");
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println(details);
                    System.out.println("-----------------------------------------------");
                    break;
                case '2':
                    //System.out.println("2.登记收入");
                    System.out.print("本次收入金额：");
                    int plusMoney=Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String plusInfo=Utility.readString();
                    balance+=plusMoney;
                    details+="收入\t\t"+balance+"\t\t"+plusMoney+"\t\t\t"+plusInfo+'\n';
                    System.out.println("--------------------登记完成--------------------");
                    break;
                case '3':
                    //System.out.println("3.登记支出");
                    System.out.print("本次支出金额：");
                    int reduceMoney=Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String reduceInfo = Utility.readString();
                    if(balance>=reduceMoney){
                        balance-=reduceMoney;
                        details+="支出\t\t"+balance+"\t\t"+reduceMoney+"\t\t\t"+reduceInfo+'\n';
                    }else{
                        System.out.println("透支，支付失败");
                    }
                    System.out.println("--------------------登记完成--------------------");
                    break;
                case '4':
                    //System.out.println("4.退   出");
                    char isExit=Utility.readConfirmSelection();
                    if(isExit=='Y'){
                        flag=false;
                    }
                    break;
            }

        }
    }
}
