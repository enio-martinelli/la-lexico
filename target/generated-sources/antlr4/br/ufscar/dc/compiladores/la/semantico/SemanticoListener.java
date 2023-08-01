// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.la.semantico;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SemanticoParser}.
 */
public interface SemanticoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(SemanticoParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(SemanticoParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(SemanticoParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(SemanticoParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(SemanticoParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(SemanticoParser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(SemanticoParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(SemanticoParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(SemanticoParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(SemanticoParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(SemanticoParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(SemanticoParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(SemanticoParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(SemanticoParser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(SemanticoParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(SemanticoParser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(SemanticoParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(SemanticoParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(SemanticoParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(SemanticoParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(SemanticoParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(SemanticoParser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(SemanticoParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(SemanticoParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(SemanticoParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(SemanticoParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(SemanticoParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(SemanticoParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(SemanticoParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(SemanticoParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(SemanticoParser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(SemanticoParser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(SemanticoParser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(SemanticoParser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(SemanticoParser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(SemanticoParser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(SemanticoParser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(SemanticoParser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(SemanticoParser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(SemanticoParser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(SemanticoParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(SemanticoParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(SemanticoParser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(SemanticoParser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(SemanticoParser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(SemanticoParser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(SemanticoParser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(SemanticoParser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(SemanticoParser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(SemanticoParser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(SemanticoParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(SemanticoParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(SemanticoParser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(SemanticoParser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(SemanticoParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(SemanticoParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(SemanticoParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(SemanticoParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(SemanticoParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(SemanticoParser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(SemanticoParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(SemanticoParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(SemanticoParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(SemanticoParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(SemanticoParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(SemanticoParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(SemanticoParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(SemanticoParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(SemanticoParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(SemanticoParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(SemanticoParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(SemanticoParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(SemanticoParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(SemanticoParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(SemanticoParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(SemanticoParser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(SemanticoParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(SemanticoParser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(SemanticoParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(SemanticoParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(SemanticoParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(SemanticoParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(SemanticoParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(SemanticoParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(SemanticoParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(SemanticoParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(SemanticoParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(SemanticoParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(SemanticoParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(SemanticoParser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(SemanticoParser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(SemanticoParser.Op_logico_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticoParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_2(SemanticoParser.Op_logico_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticoParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_2(SemanticoParser.Op_logico_2Context ctx);
}