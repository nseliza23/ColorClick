//layout

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.shape.Rectangle;
import javafx.scene.input.MouseEvent;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ColorClick extends HBox{

	//instance variables
	private Label title, check, win; //title - displayed at top, check - checks if tiles match colors, win - displayed if all colors are matched
	private Rectangle aa, ab, ac, ad, ba, bb, bc, bd, ca, cb, cc, cd, da, db, dc, dd; //4 x 4 grid of rectangles
	private Button replay;//play again

	//constructor
	public ColorClick(){
	//layout
	BorderPane bp = new BorderPane();
	GridPane gp = new GridPane();
	gp.setPrefWidth(500);
	gp.setPadding(new Insets(15, 15, 15, 15));
	gp.setStyle("-fx-border-color: black");

	//title
	title = new Label("COLOR CLICK");
	title.setTextFill(Color.BLUE);
    title.setFont(Font.font(null, 20));

    bp.setTop(title);
    bp.setAlignment(title, Pos.CENTER);

	//horizontal and vertical spacing between tiles
	gp.setHgap(20);
	gp.setVgap(20);

	//row 1
    aa = new Rectangle(100, 100, 100, 100);
    ab = new Rectangle(100, 100, 100, 100);
    ac = new Rectangle(100, 100, 100, 100);
    ad = new Rectangle(100, 100, 100, 100);

    gp.add(aa, 0, 0);
    gp.add(ab, 1, 0);
    gp.add(ac, 2, 0);
    gp.add(ad, 3, 0);

    //row 2
    ba = new Rectangle(100, 100, 100, 100);
	bb = new Rectangle(100, 100, 100, 100);
	bc = new Rectangle(100, 100, 100, 100);
	bd = new Rectangle(100, 100, 100, 100);

	gp.add(ba, 0, 1);
	gp.add(bb, 1, 1);
	gp.add(bc, 2, 1);
    gp.add(bd, 3, 1);

    //row 3
	ca = new Rectangle(100, 100, 100, 100);
	cb = new Rectangle(100, 100, 100, 100);
	cc = new Rectangle(100, 100, 100, 100);
	cd = new Rectangle(100, 100, 100, 100);

	gp.add(ca, 0, 2);
	gp.add(cb, 1, 2);
	gp.add(cc, 2, 2);
	gp.add(cd, 3, 2);

	//row 4
	da = new Rectangle(100, 100, 100, 100);
	db = new Rectangle(100, 100, 100, 100);
	dc = new Rectangle(100, 100, 100, 100);
	dd = new Rectangle(100, 100, 100, 100);

	gp.add(da, 0, 3);
	gp.add(db, 1, 3);
	gp.add(dc, 2, 3);
    gp.add(dd, 3, 3);

	//button
    replay = new Button("PLAY AGAIN!");
    PlayAgain play = new PlayAgain();
    replay.setOnAction(play);

    //gp.getChildren().addAll(aa, ab, ac, ad);
    bp.setCenter(gp);
    bp.setBottom(replay);
    bp.setAlignment(replay, Pos.CENTER);
    this.setPadding(new Insets(5,40, 10, 40));
    this.getChildren().add(bp);

	ColorChange colorChange = new ColorChange();
	//row 1
	aa.setOnMouseClicked(colorChange);
	ab.setOnMouseClicked(colorChange);
	ac.setOnMouseClicked(colorChange);
	ad.setOnMouseClicked(colorChange);

	//row 2
	ba.setOnMouseClicked(colorChange);
	bb.setOnMouseClicked(colorChange);
	bc.setOnMouseClicked(colorChange);
	bd.setOnMouseClicked(colorChange);

	//row 3
	ca.setOnMouseClicked(colorChange);
	cb.setOnMouseClicked(colorChange);
	cc.setOnMouseClicked(colorChange);
	cd.setOnMouseClicked(colorChange);

	//row 4
	da.setOnMouseClicked(colorChange);
	db.setOnMouseClicked(colorChange);
	dc.setOnMouseClicked(colorChange);
	dd.setOnMouseClicked(colorChange);
	}//end of constructor

	////when each tile is clicked, it changes color
	private class ColorChange implements EventHandler<MouseEvent>{
		public void handle(MouseEvent m){
			Rectangle tile = (Rectangle)m.getSource();
			if(tile == aa){
				aa.setFill(Color.RED);
		    }
		    if(tile == ab){
			    ab.setFill(Color.BLUE);
			}
			if(tile == ac)
			{
			    ac.setFill(Color.GREEN);
		    }
		    if(tile == ad)
			{
			    ad.setFill(Color.YELLOW);
			}

			if(tile == ba)
			{
			    ba.setFill(Color.AQUA);
			}
			if(tile == bb)
			{
			    bb.setFill(Color.BLUEVIOLET);
			}
			if(tile == bc)
			{
			    bc.setFill(Color.HOTPINK);
			}
			if(tile == bd)
			{
			    bd.setFill(Color.MEDIUMSPRINGGREEN);
			}

			if(tile == ca)
			{
				ca.setFill(Color.GREEN);
			}
			if(tile == cb)
			{
			    cb.setFill(Color.YELLOW);
			}
			if(tile == cc)
			{
			    cc.setFill(Color.RED);
			}
			if(tile == cd)
			{
			    cd.setFill(Color.BLUE);
			}
			if(tile == da)
			{
			    da.setFill(Color.HOTPINK);
			}
			if(tile == db)
			{
			    db.setFill(Color.MEDIUMSPRINGGREEN);
			}
			if(tile == dc)
			{
			    dc.setFill(Color.AQUA);
			}
			if(tile == dd)
			{
			    dd.setFill(Color.BLUEVIOLET);
			}
		}
	}//end of ColorChange

	private class PlayAgain implements EventHandler<ActionEvent>{
		public void handle(ActionEvent e){
			//reset to default
			aa.setFill(Color.BLACK);
			ab.setFill(Color.BLACK);
			ac.setFill(Color.BLACK);
			ad.setFill(Color.BLACK);

			ba.setFill(Color.BLACK);
			bb.setFill(Color.BLACK);
			bc.setFill(Color.BLACK);
			bd.setFill(Color.BLACK);

			ca.setFill(Color.BLACK);
			cb.setFill(Color.BLACK);
			cc.setFill(Color.BLACK);
			cd.setFill(Color.BLACK);

			da.setFill(Color.BLACK);
			db.setFill(Color.BLACK);
			dc.setFill(Color.BLACK);
			dd.setFill(Color.BLACK);
		}
	}

}
