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
public class Ex01 {
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
			sql = "UPDATE test_members SET name='遠藤次郎' WHERE id=3;";

			// (3)SQL実行準備
			pstmt = con.prepareStatement(sql);

			// (4)SQL実行
			// ※ここにSQL実行処理を書く
       int numOfUpdate=pstmt.executeUpdate();
			// (5)結果の操作
			// ※ここに結果の操作処理を書く
System.out.println(numOfUpdate+"件更新しました");
		} catch (SQLException ex) {
			System.err.println("SQL = " + sql);
			ex.printStackTrace();
		} finally {
			try {
				// (6) メモリの解放(切断)
                if(!(con==null)){
                   con.close(); 
                }if(!(pstmt==null)){
                   pstmt.close(); 
                }
			} catch (Exception ex) {}
		}
	}
}
