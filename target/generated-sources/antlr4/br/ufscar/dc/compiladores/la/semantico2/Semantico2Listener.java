// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.la.semantico2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Semantico2Parser}.
 */
public interface Semantico2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(Semantico2Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(Semantico2Parser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(Semantico2Parser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(Semantico2Parser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(Semantico2Parser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(Semantico2Parser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(Semantico2Parser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(Semantico2Parser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(Semantico2Parser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(Semantico2Parser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(Semantico2Parser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(Semantico2Parser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(Semantico2Parser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(Semantico2Parser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(Semantico2Parser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(Semantico2Parser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(Semantico2Parser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(Semantico2Parser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(Semantico2Parser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(Semantico2Parser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(Semantico2Parser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(Semantico2Parser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(Semantico2Parser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(Semantico2Parser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(Semantico2Parser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(Semantico2Parser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(Semantico2Parser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(Semantico2Parser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(Semantico2Parser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(Semantico2Parser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(Semantico2Parser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(Semantico2Parser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(Semantico2Parser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(Semantico2Parser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(Semantico2Parser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(Semantico2Parser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(Semantico2Parser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(Semantico2Parser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(Semantico2Parser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(Semantico2Parser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(Semantico2Parser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(Semantico2Parser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(Semantico2Parser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(Semantico2Parser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(Semantico2Parser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(Semantico2Parser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(Semantico2Parser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(Semantico2Parser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(Semantico2Parser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(Semantico2Parser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(Semantico2Parser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(Semantico2Parser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(Semantico2Parser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(Semantico2Parser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(Semantico2Parser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(Semantico2Parser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(Semantico2Parser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(Semantico2Parser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(Semantico2Parser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(Semantico2Parser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(Semantico2Parser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(Semantico2Parser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(Semantico2Parser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(Semantico2Parser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(Semantico2Parser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(Semantico2Parser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(Semantico2Parser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(Semantico2Parser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(Semantico2Parser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(Semantico2Parser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(Semantico2Parser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(Semantico2Parser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(Semantico2Parser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(Semantico2Parser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(Semantico2Parser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(Semantico2Parser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(Semantico2Parser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(Semantico2Parser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(Semantico2Parser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(Semantico2Parser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(Semantico2Parser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(Semantico2Parser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(Semantico2Parser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(Semantico2Parser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(Semantico2Parser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(Semantico2Parser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(Semantico2Parser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(Semantico2Parser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(Semantico2Parser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(Semantico2Parser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(Semantico2Parser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(Semantico2Parser.Op_logico_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Semantico2Parser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_2(Semantico2Parser.Op_logico_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Semantico2Parser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_2(Semantico2Parser.Op_logico_2Context ctx);
}