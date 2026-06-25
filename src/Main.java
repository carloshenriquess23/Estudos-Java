//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    System.out.println("To lembrando que Java existe");

    byte testeImplicito= 5;
    float testeImplicito2=testeImplicito;

    byte testeExpllicito=(byte) testeImplicito2;

    System.out.println("Testando ei");
    System.out.println(testeImplicito);
    System.out.println(testeImplicito2);
    System.out.println(testeExpllicito);
}
