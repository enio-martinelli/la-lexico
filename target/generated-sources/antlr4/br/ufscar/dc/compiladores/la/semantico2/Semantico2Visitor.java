// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.la.semantico2;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Semantico2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Semantico2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(Semantico2Parser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(Semantico2Parser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#declaracao_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_local(Semantico2Parser.Declaracao_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(Semantico2Parser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(Semantico2Parser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(Semantico2Parser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#tipo_basico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico(Semantico2Parser.Tipo_basicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#tipo_estendido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_estendido(Semantico2Parser.Tipo_estendidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#valor_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_constante(Semantico2Parser.Valor_constanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(Semantico2Parser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#declaracao_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_global(Semantico2Parser.Declaracao_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(Semantico2Parser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(Semantico2Parser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(Semantico2Parser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(Semantico2Parser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#cmdLeia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLeia(Semantico2Parser.CmdLeiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#cmdEscreva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEscreva(Semantico2Parser.CmdEscrevaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#cmdSe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSe(Semantico2Parser.CmdSeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#cmdCaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCaso(Semantico2Parser.CmdCasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#cmdPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPara(Semantico2Parser.CmdParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#cmdEnquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEnquanto(Semantico2Parser.CmdEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#cmdFaca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFaca(Semantico2Parser.CmdFacaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtribuicao(Semantico2Parser.CmdAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#cmdChamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdChamada(Semantico2Parser.CmdChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#cmdRetorne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRetorne(Semantico2Parser.CmdRetorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(Semantico2Parser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#item_selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_selecao(Semantico2Parser.Item_selecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(Semantico2Parser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#numero_intervalo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero_intervalo(Semantico2Parser.Numero_intervaloContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#op_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_unario(Semantico2Parser.Op_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#exp_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_aritmetica(Semantico2Parser.Exp_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(Semantico2Parser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(Semantico2Parser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(Semantico2Parser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(Semantico2Parser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3(Semantico2Parser.Op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(Semantico2Parser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#parcela_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_unario(Semantico2Parser.Parcela_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_nao_unario(Semantico2Parser.Parcela_nao_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#exp_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_relacional(Semantico2Parser.Exp_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(Semantico2Parser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(Semantico2Parser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#termo_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_logico(Semantico2Parser.Termo_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#fator_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_logico(Semantico2Parser.Fator_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#parcela_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_logica(Semantico2Parser.Parcela_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#op_logico_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_1(Semantico2Parser.Op_logico_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Semantico2Parser#op_logico_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_2(Semantico2Parser.Op_logico_2Context ctx);
}