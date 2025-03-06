public class RecordJava {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            LPAStudent s = new LPAStudent("S9230" + i,
                    switch (i){
                    case 1 -> "mary";
                    case 2 -> "john";
                    case 3 -> "jane";
                    case 4 -> "james";
                    case 5 -> "jay";
                    default -> "unknown";
                    }

                    ,"18/02/2000","java masterClass");

            System.out.println(s);
        }

        Student pojoStudent = new Student("2000","ann","05/2/2002","java MasterClass");
        LPAStudent recordStudent = new LPAStudent("2002","tien","06/3/2003","java MasterClass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList()+" Java OCP Exam 829");
       // recordStudent.setClassList(recordStudent.getClassList()+" Java OCP Exam 829");

        System.out.println(pojoStudent.getName()+" is talking "+pojoStudent.getClassList());
        System.out.println(recordStudent.name()+" is talking "+recordStudent.classList());
    }
}
