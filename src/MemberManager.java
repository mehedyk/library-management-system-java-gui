import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

public class MemberManager {
    private Map<String, Member> members;

    public MemberManager() {
        members = new HashMap<>();
    }

    public void registerMember(String id, String name, String password) {
        if(members.containsKey(id)) {
            JOptionPane.showMessageDialog(null, "Member already exists.");
        } else {
            members.put(id, new Member(id, name, password));
            JOptionPane.showMessageDialog(null, "Member registered: " + name);
        }
    }

    public Member loginMember(String id, String password) {
        Member member = members.get(id);
        if(member != null && member.getPassword().equals(password))
            return member;
        return null;
    }

    public Map<String, Member> getMembers() {
        return members;
    }

    public void listMembers() {
        if(members.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No members registered.");
        } else {
            StringBuilder sb = new StringBuilder();
            for(Member m : members.values()) {
                sb.append(m.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString(), "Member List", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}