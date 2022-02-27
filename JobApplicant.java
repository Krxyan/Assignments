public class JobApplicant {

String name;

String phone;

boolean hasWordSkill, hasSpreadsheetSkill, hasDatabaseSkill, hasGraphicsSkill;

public JobApplicant(String name, String phone, boolean w, boolean s, boolean d, boolean g) {

this.name = name;

this.phone = phone;

this.hasWordSkill = w;

this.hasSpreadsheetSkill = s;

this.hasDatabaseSkill = d;

this.hasGraphicsSkill = g;

}

public String getName() {

return name;

}

public String getPhone() {

return phone;

}

public boolean getHasWordSkill() {

return hasWordSkill;

}

public boolean getHasSpreadSheetSkill() {

return hasSpreadsheetSkill;

}

public boolean getHasDataBaseSkill() {

return hasDatabaseSkill;

}

public boolean getHasGraphicsSkill() {

return hasGraphicsSkill;

}



}
