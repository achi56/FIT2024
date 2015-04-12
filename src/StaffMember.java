/**
 * Created by Aaron on 12/04/2015.
 */
public class StaffMember {
    private int staffID;
    private String staffName;
    private int staffRoom;
    private int staffPhone;

    public StaffMember(int initStaffID, String initStaffName, int initStaffRoom, int initstaffPhone) {
        staffID = initStaffID;
        staffName = initStaffName;
        staffRoom = initStaffRoom;
        staffPhone = initstaffPhone;
    }

    public String description() {
        return ("ID: " + staffID + " Name: " + staffName + " Room: " + staffRoom + " Phone: " + staffPhone);
    }
}
