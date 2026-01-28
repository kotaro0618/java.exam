package exam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 雛形クラスです.<br>
 * これをコピーペーストして問題を解いて構いません。
 * 
 * @author igamasayuki
 */
public class Ex03 {
	public static void main(String[] args) {
		// 接続情報
		String url = "jdbc:postgresql://localhost:5432/student";
		String user = "postgres";
		String password = "postgres";

		Connection con = null; // 使用する変数の宣言
		PreparedStatement pstmt = null;
		String sql = null;
		ResultSet rs=null;

		try {
			// (1)データベースに接続
			con = DriverManager.getConnection(url, user, password);

			// (2)SQL文を作成
			sql = "SELECT id,name,age,dep_name JOIN test_members.id ON test_dep.id;";

			// (3)SQL実行準備
			pstmt = con.prepareStatement(sql);

			// (4)SQL実行
			// ※ここにSQL実行処理を書く
rs=pstmt.executeQuery();
			// (5)結果の操作
			while(rs.next()){
	int id=rs.getInt("id");
	String name=rs.getString("name");
	int age=rs.getInt("age");
	int dep_name=rs.getInt("dep_name");
	System.out.print("id:"+id);
	System.out.print("name:"+name);
	System.out.print("age:"+age);
	System.out.println("dep_id:"+dep_name);
	
}
			// ※ここに結果の操作処理を書く

		} catch (SQLException ex) {
			System.err.println("SQL = " + sql);
			ex.printStackTrace();
		} finally {
			try {
				// (6) メモリの解放(切断)
				con.close();
			} catch (Exception ex) {}
		}
	}
}
