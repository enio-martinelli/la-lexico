// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.la.sintatico;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SintaticoParser}.
 */
public interface SintaticoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(SintaticoParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(SintaticoParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(SintaticoParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(SintaticoParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#declaracao_variaveis}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_variaveis(SintaticoParser.Declaracao_variaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#declaracao_variaveis}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_variaveis(SintaticoParser.Declaracao_variaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(SintaticoParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(SintaticoParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(SintaticoParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(SintaticoParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(SintaticoParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(SintaticoParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(SintaticoParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(SintaticoParser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#tipo_variavel}.
	 * @param ctx the parse tree
	 */
	void enterTipo_variavel(SintaticoParser.Tipo_variavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#tipo_variavel}.
	 * @param ctx the parse tree
	 */
	void exitTipo_variavel(SintaticoParser.Tipo_variavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(SintaticoParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(SintaticoParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(SintaticoParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(SintaticoParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(SintaticoParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(SintaticoParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(SintaticoParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(SintaticoParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#declaracao_funcoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_funcoes(SintaticoParser.Declaracao_funcoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#declaracao_funcoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_funcoes(SintaticoParser.Declaracao_funcoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(SintaticoParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(SintaticoParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(SintaticoParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(SintaticoParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(SintaticoParser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(SintaticoParser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(SintaticoParser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(SintaticoParser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(SintaticoParser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(SintaticoParser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(SintaticoParser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(SintaticoParser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(SintaticoParser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(SintaticoParser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(SintaticoParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(SintaticoParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(SintaticoParser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(SintaticoParser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(SintaticoParser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(SintaticoParser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(SintaticoParser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(SintaticoParser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(SintaticoParser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(SintaticoParser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(SintaticoParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(SintaticoParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(SintaticoParser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(SintaticoParser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(SintaticoParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(SintaticoParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(SintaticoParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(SintaticoParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(SintaticoParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(SintaticoParser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(SintaticoParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(SintaticoParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(SintaticoParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(SintaticoParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(SintaticoParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(SintaticoParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(SintaticoParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(SintaticoParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(SintaticoParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(SintaticoParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(SintaticoParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(SintaticoParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(SintaticoParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(SintaticoParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(SintaticoParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(SintaticoParser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(SintaticoParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(SintaticoParser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(SintaticoParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(SintaticoParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(SintaticoParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(SintaticoParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(SintaticoParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(SintaticoParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(SintaticoParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(SintaticoParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(SintaticoParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(SintaticoParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(SintaticoParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(SintaticoParser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(SintaticoParser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(SintaticoParser.Op_logico_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SintaticoParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_2(SintaticoParser.Op_logico_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SintaticoParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_2(SintaticoParser.Op_logico_2Context ctx);
}