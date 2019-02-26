package GUI;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/*
Button _Button = new ElementButton( , "", "");
this.add(child, columnIndex, rowIndex);
*/

public class ElementsGridPane extends GridPane {

	public ElementsGridPane() {
		super();
		this.setAlignment(Pos.CENTER);
		this.setHgap(3);
		this.setVgap(3);
		
		// Row 1
		Button h_Button = new ElementButton(1, "H", "Hydrogen");
		this.add(h_Button, 0, 0);
		Button he_Button = new ElementButton(2, "He", "Helium");
		this.add(he_Button, 17, 0);
		
		// Row 2
		Button li_Button = new ElementButton(3, "Li", "Lithium");
		this.add(li_Button, 0, 1);
		Button be_Button = new ElementButton(4, "Be", "Beryllium");
		this.add(be_Button, 1, 1);
		Button b_Button = new ElementButton( 5, "B", "Boron");
		this.add(b_Button, 12, 1);
		Button c_Button = new ElementButton( 6, "C", "Carbon");
		this.add(c_Button, 13, 1);
		Button n_Button = new ElementButton( 7, "N", "Nitrogen");
		this.add(n_Button, 14, 1);
		Button o_Button = new ElementButton( 8, "O", "Oxygen");
		this.add(o_Button, 15, 1);
		Button f_Button = new ElementButton( 9, "F", "Fluorine");
		this.add(f_Button, 16, 1);
		Button ne_Button = new ElementButton( 10, "Ne", "Neon");
		this.add(ne_Button, 17, 1);
		
		// Row 3
		Button na_Button = new ElementButton(11, "Na", "Sodium");
		this.add(na_Button, 0, 2);
		Button mg_Button = new ElementButton(12, "Mg", "Magnesium");
		this.add(mg_Button, 1, 2);
		Button al_Button = new ElementButton( 13, "Al", "Aluminium");
		this.add(al_Button, 12, 2);
		Button si_Button = new ElementButton( 14, "Si", "Silicon");
		this.add(si_Button, 13, 2);
		Button p_Button = new ElementButton( 15, "P", "Phosphorus");
		this.add(p_Button, 14, 2);
		Button s_Button = new ElementButton( 16, "S", "Sulfur");
		this.add(s_Button, 15, 2);
		Button cl_Button = new ElementButton( 17, "Cl", "Chlorine");
		this.add(cl_Button, 16, 2);
		Button ar_Button = new ElementButton( 18, "Ar", "Argon");
		this.add(ar_Button, 17, 2);
		
		// Row 4
		Button k_Button = new ElementButton( 19, "K", "Potassium");
		this.add(k_Button, 0, 3);
		Button ca_Button = new ElementButton( 20, "Ca", "Calcium");
		this.add(ca_Button, 1, 3);
		Button sc_Button = new ElementButton( 21, "Sc", "Scandium");
		this.add(sc_Button, 2, 3);
		Button ti_Button = new ElementButton( 22, "Ti", "Titanium");
		this.add(ti_Button, 3, 3);
		Button v_Button = new ElementButton( 23, "V", "Vanadium");
		this.add(v_Button, 4, 3);
		Button cr_Button = new ElementButton( 24, "Cr", "Chromium");
		this.add(cr_Button, 5, 3);
		Button mn_Button = new ElementButton( 25, "Mn", "Manganese");
		this.add(mn_Button, 6, 3);
		Button fe_Button = new ElementButton( 26, "Fe", "Iron");
		this.add(fe_Button, 7, 3);
		Button co_Button = new ElementButton( 27, "Co", "Cobalt");
		this.add(co_Button, 8, 3);
		Button ni_Button = new ElementButton( 28, "Ni", "Nickel");
		this.add(ni_Button, 9, 3);
		Button cu_Button = new ElementButton( 29, "Cu", "Copper");
		this.add(cu_Button, 10, 3);
		Button zn_Button = new ElementButton( 30, "Zn", "Zinc");
		this.add(zn_Button, 11, 3);
		Button ga_Button = new ElementButton( 31, "Ga", "Gallium");
		this.add(ga_Button, 12, 3);
		Button ge_Button = new ElementButton( 32, "Ge", "Germanium");
		this.add(ge_Button, 13, 3);
		Button as_Button = new ElementButton( 33, "As", "Arsenic");
		this.add(as_Button, 14, 3);
		Button se_Button = new ElementButton( 34, "Se", "Selenium");
		this.add(se_Button, 15, 3);
		Button br_Button = new ElementButton( 35, "Br", "Bromine");
		this.add(br_Button, 16, 3);
		Button kr_Button = new ElementButton( 36, "Kr", "Krypton");
		this.add(kr_Button, 17, 3);
		
		// Row 5
		Button rb_Button = new ElementButton( 37, "Rb", "Rubidium");
		this.add(rb_Button, 0, 4);
		Button sr_Button = new ElementButton( 38, "Sr", "Strontium");
		this.add(sr_Button, 1, 4);
		Button y_Button = new ElementButton( 39, "Y", "Yttrium");
		this.add(y_Button, 2, 4);
		Button zr_Button = new ElementButton( 40, "Zr", "Zirconium");
		this.add(zr_Button, 3, 4);
		Button nb_Button = new ElementButton( 41, "Nb", "Niobium");
		this.add(nb_Button, 4, 4);
		Button mo_Button = new ElementButton( 42, "Mo", "Molybdenum");
		this.add(mo_Button, 5, 4);
		Button tc_Button = new ElementButton( 43, "Tc", "Technetium");
		this.add(tc_Button, 6, 4);
		Button ru_Button = new ElementButton( 44, "Ru", "Ruthenium");
		this.add(ru_Button, 7, 4);
		Button rh_Button = new ElementButton( 45, "Rh", "Rhodium");
		this.add(rh_Button, 8, 4);
		Button pd_Button = new ElementButton( 46, "Pd", "Palladium");
		this.add(pd_Button, 9, 4);
		Button ag_Button = new ElementButton( 47, "Ag", "Silver");
		this.add(ag_Button, 10, 4);
		Button cd_Button = new ElementButton( 48, "Cd", "Cadmium");
		this.add(cd_Button, 11, 4);
		Button in_Button = new ElementButton( 49, "In", "Indium");
		this.add(in_Button, 12, 4);
		Button sn_Button = new ElementButton( 50, "Sn", "Tin");
		this.add(sn_Button, 13, 4);
		Button sb_Button = new ElementButton( 51, "Sb", "Antimoney");
		this.add(sb_Button, 14, 4);
		Button te_Button = new ElementButton( 52, "Te", "Tellerium");
		this.add(te_Button, 15, 4);
		Button i_Button = new ElementButton( 53, "I", "Iodine");
		this.add(i_Button, 16, 4);
		Button xe_Button = new ElementButton( 54, "Xe", "Xenon");
		this.add(xe_Button, 17, 4);
		
		// Row 6
		Button cs_Button = new ElementButton(55, "Cs", "Caesium");
		this.add(cs_Button, 0, 5);
		Button ba_Button = new ElementButton(55, "Ba", "Barium");
		this.add(ba_Button, 1, 5);
		
		HBox labelBox1 = new HBox();
		labelBox1.setAlignment(Pos.CENTER);
		Label lblExtraRow1 = new Label("57-71");
		lblExtraRow1.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		labelBox1.getChildren().add(lblExtraRow1);
		this.add(labelBox1, 2, 5);
		
		Button hf_Button = new ElementButton(72, "Hf", "Hafnium");
		this.add(hf_Button, 3, 5);
		Button ta_Button = new ElementButton(73, "Ta", "Tantalum");
		this.add(ta_Button, 4, 5);
		Button w_Button = new ElementButton(74, "W", "Tungsten");
		this.add(w_Button, 5, 5);
		Button re_Button = new ElementButton(75, "Re", "Rhenium");
		this.add(re_Button, 6, 5);
		Button os_Button = new ElementButton(76, "Os", "Osmium");
		this.add(os_Button, 7, 5);
		Button ir_Button = new ElementButton(77, "Ir", "Iridium");
		this.add(ir_Button, 8, 5);
		Button pt_Button = new ElementButton(78, "Pt", "Platinum");
		this.add(pt_Button, 9, 5);
		Button au_Button = new ElementButton(79, "Au", "Gold");
		this.add(au_Button, 10, 5);
		Button hg_Button = new ElementButton(80, "Hg", "Mercury");
		this.add(hg_Button, 11, 5);
		Button tl_Button = new ElementButton(81, "Tl", "Thallium");
		this.add(tl_Button, 12, 5);
		Button pb_Button = new ElementButton(82, "Pb", "Lead");
		this.add(pb_Button, 13, 5);
		Button bi_Button = new ElementButton(83, "Bi", "Bismuth");
		this.add(bi_Button, 14, 5);
		Button po_Button = new ElementButton(84, "Po", "Polonium");
		this.add(po_Button, 15, 5);
		Button at_Button = new ElementButton(85, "At", "Astatine");
		this.add(at_Button, 16, 5);
		Button rn_Button = new ElementButton(86, "Rn", "Radon");
		this.add(rn_Button, 17, 5);
		
		
		// Row 7
		Button fr_Button = new ElementButton(87, "Fr", "Francium");
		this.add(fr_Button, 0, 6);
		Button ra_Button = new ElementButton(88, "Ra", "Radium");
		this.add(ra_Button, 1, 6);
		
		HBox labelBox2 = new HBox();
		labelBox2.setAlignment(Pos.CENTER);
		Label lblExtraRow2 = new Label("89-103");
		lblExtraRow2.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
		labelBox2.getChildren().add(lblExtraRow2);
		this.add(labelBox2, 2, 6);
		
		Button rf_Button = new ElementButton(104, "Rf", "Rutherfordium");
		this.add(rf_Button, 3, 6);
		Button db_Button = new ElementButton(105, "Db", "Dubnium");
		this.add(db_Button, 4, 6);
		Button sg_Button = new ElementButton(106, "Sg", "Seaborgium");
		this.add(sg_Button, 5, 6);
		Button bh_Button = new ElementButton(107, "Bh", "Bohrium");
		this.add(bh_Button, 6, 6);
		Button hs_Button = new ElementButton(108, "Hs", "Hassium");
		this.add(hs_Button, 7, 6);
		Button mt_Button = new ElementButton(104, "Mt", "Meitnerium");
		this.add(mt_Button, 8, 6);
		Button ds_Button = new ElementButton( 110, "Ds", "Darmstadtium");
		this.add(ds_Button, 9, 6);
		Button rg_Button = new ElementButton( 111, "Rg", "Roentgenium");
		this.add(rg_Button, 10, 6);
		Button uub_Button = new ElementButton( 112, "Uub", "Copernicium");
		this.add(uub_Button, 11, 6);
		Button uut_Button = new ElementButton( 113, "Uut", "Nihonium");
		this.add(uut_Button, 12, 6);
		Button uuq_Button = new ElementButton( 114, "Uuq", "Flerovium");
		this.add(uuq_Button, 13, 6);
		Button uup_Button = new ElementButton( 115, "Uup", "Moscovium");
		this.add(uup_Button, 14, 6);
		Button uuh_Button = new ElementButton( 116, "Uuh", "Livermorium");
		this.add(uuh_Button, 15, 6);
		Button uus_Button = new ElementButton( 117, "Uus", "Tennessine");
		this.add(uus_Button, 16, 6);
		Button uuo_Button = new ElementButton( 118, "Uuo", "Oganesson");
		this.add(uuo_Button, 17, 6);
		
		// Separator
		this.add(new Separator(), 0, 10, 18, 1);
		
		// 57 - 71
		Button la_Button = new ElementButton( 57, "La", "Lanthanum");
		this.add(la_Button, 2, 14);
		Button ce_Button = new ElementButton( 58, "Ce", "Cerium");
		this.add(ce_Button, 3, 14);
		Button pr_Button = new ElementButton( 59, "Pr", "Praseodymium");
		this.add(pr_Button, 4, 14);
		Button nd_Button = new ElementButton( 60, "Nd", "Neodymium");
		this.add(nd_Button, 5, 14);
		Button pm_Button = new ElementButton( 61, "Pm", "Promethium");
		this.add(pm_Button, 6, 14);
		Button sm_Button = new ElementButton( 62, "Sm", "Samarium");
		this.add(sm_Button, 7, 14);
		Button eu_Button = new ElementButton( 63, "Eu", "Europium");
		this.add(eu_Button, 8, 14);
		Button gd_Button = new ElementButton( 64, "Gd", "Gadolinium");
		this.add(gd_Button, 9, 14);
		Button tb_Button = new ElementButton( 65, "Tb", "Terbium");
		this.add(tb_Button, 10, 14);
		Button dy_Button = new ElementButton( 66, "Dy", "Dysprosium");
		this.add(dy_Button, 11, 14);
		Button ho_Button = new ElementButton( 67, "Ho", "Holmium");
		this.add(ho_Button, 12, 14);
		Button er_Button = new ElementButton( 68, "Er", "Erbium");
		this.add(er_Button, 13, 14);
		Button tm_Button = new ElementButton( 69, "Tm", "Thulium");
		this.add(tm_Button, 14, 14);
		Button yb_Button = new ElementButton( 70, "Yb", "Ytterbium");
		this.add(yb_Button, 15, 14);
		Button lu_Button = new ElementButton( 71, "Lu", "Lutetium");
		this.add(lu_Button, 16, 14);
		
		// 89 - 103
		Button ac_Button = new ElementButton( 89, "Ac", "Actinium");
		this.add(ac_Button, 2, 15);
		Button th_Button = new ElementButton( 90, "Th", "Thorium");
		this.add(th_Button, 3, 15);
		Button pa_Button = new ElementButton( 91, "Pa", "Protactinium");
		this.add(pa_Button, 4, 15);
		Button u_Button = new ElementButton( 92, "U", "Uranium");
		this.add(u_Button, 5, 15);
		Button np_Button = new ElementButton( 93, "Np", "Neptunium");
		this.add(np_Button, 6, 15);
		Button pu_Button = new ElementButton( 94, "Pu", "Plutonium");
		this.add(pu_Button, 7, 15);
		Button am_Button = new ElementButton( 95, "Am", "Americium");
		this.add(am_Button, 8, 15);
		Button cm_Button = new ElementButton( 96, "Cm", "Curium");
		this.add(cm_Button, 9, 15);
		Button bk_Button = new ElementButton( 97, "Bk", "Berkelium");
		this.add(bk_Button, 10, 15);
		Button cf_Button = new ElementButton( 98, "Cf", "Californium");
		this.add(cf_Button, 11, 15);
		Button es_Button = new ElementButton( 99, "Es", "Einsteinium");
		this.add(es_Button, 12, 15);
		Button fm_Button = new ElementButton( 100, "Fm", "Fermium");
		this.add(fm_Button, 13, 15);
		Button md_Button = new ElementButton( 101, "Md", "Mendelevium");
		this.add(md_Button, 14, 15);
		Button no_Button = new ElementButton( 102, "No", "Nobelium");
		this.add(no_Button, 15, 15);
		Button lr_Button = new ElementButton( 103, "Lr", "Lawrencium");
		this.add(lr_Button, 16, 15);
	}
	
}
