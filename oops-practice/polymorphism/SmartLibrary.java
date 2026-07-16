class LibraryMember {
    String memberName;
    String memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    public double calculateFine(int overdueDays) {
        return 0;
    }

    public void printDetails() {
        System.out.println("Name: " + memberName);
        System.out.println("ID: " + memberId);
    }
}

class StudentMember extends LibraryMember {
    StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 2;
    }
}

class FacultyMember extends LibraryMember {
    FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 1;
    }
}

class GuestMember extends LibraryMember {
    GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 5;
    }
}

public class SmartLibrary {
    public static void main(String[] args) {
        LibraryMember[] members = {
            new StudentMember("Nishant", "S101"),
            new FacultyMember("Rahul", "F201"),
            new GuestMember("Priya", "G301")
        };

        int overdueDays = 4;

        for (LibraryMember member : members) {
            member.printDetails();
            System.out.println("Fine: Rs. " + member.calculateFine(overdueDays));
            System.out.println();
        }

        String searchId = "F201";
        boolean found = false;

        for (LibraryMember member : members) {
            if (member.memberId.equals(searchId)) {
                System.out.println("Member Found:");
                member.printDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Member not found.");
        }
    }
}